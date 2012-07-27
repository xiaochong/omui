package org.grails.plugins.omui

import com.alibaba.fastjson.serializer.JSONSerializer
import com.alibaba.fastjson.serializer.PropertyFilter
import com.alibaba.fastjson.serializer.SerializeConfig
import com.alibaba.fastjson.serializer.SerializeWriter
import org.grails.plugins.omui.editors.EventEditor
import org.grails.plugins.omui.editors.MixedEditor
import org.grails.plugins.omui.json.Event
import org.grails.plugins.omui.json.Mixed
import org.grails.plugins.omui.serializer.JsDateFormatSerializer
import org.springframework.beans.BeanWrapperImpl

abstract class ContainerTagComponent implements Component {
    final static ArrayList<String> EXCLUDE_NAMES = ['componentName', 'containerTag', 'metaClass']
    final static SerializeConfig serializeConfig = new SerializeConfig()
    final static PropertyFilter propertyFilter = new PropertyFilter() {
        boolean apply(Object source, String name, Object value) {
            if (EXCLUDE_NAMES.contains(name)) return false
            return true
        }
    }

    static {
        serializeConfig.put(Date.class, new JsDateFormatSerializer())
    }

    abstract String getContainerTag()

    void doRender(RenderContext context) {
        init(context)
        def html = getHtml(context)
        def script = getScript(context)
        context.out << html
        context.r.script { return "$script\n"}
    }

    void init(RenderContext context) {
        BeanWrapperImpl beanWrapper = new BeanWrapperImpl(this)
        beanWrapper.registerCustomEditor(Event.class, new EventEditor())
        beanWrapper.registerCustomEditor(Mixed.class, new MixedEditor())
        context.attrs.collect {it.key}.each {String key ->
            if (this.metaClass.hasProperty(this, key)) {
                def value = context.attrs.remove(key)
                if (key.startsWith('on') && this.hasProperty(key)) {
                    def argument = this.class.getDeclaredField(key).getAnnotation(Argument)
                    if (argument) {
                        value = "function(${argument.value().join(',')}){$value}"
                    } else {
                        value = "function(){$value}"
                    }
                    beanWrapper.setPropertyValue(key, value.toString())
                } else {
                    beanWrapper.setPropertyValue(key, value)
                }
            }
        }
    }

    String getHtml(RenderContext context) {
        def attrs = context.attrs
        attrs.id = attrs.id ?: UUID.randomUUID().toString()
        def remainAttributes = attrs.findAll {
            !this.metaClass.hasProperty(this, it.key.toString())
        }
        def outputAttributeContent = remainAttributes.collect {k, v ->
            "$k=\"${v?.encodeAsHTML()}\""
        }.join(' ')
        return """<${containerTag} ${outputAttributeContent}>${context.body()}</${containerTag}>"""
    }

    String getScript(RenderContext context) {
        SerializeWriter out = new SerializeWriter()
        JSONSerializer serializer = new JSONSerializer(out, serializeConfig)
        serializer.getPropertyFilters().add(propertyFilter)
        serializer.write(this)
        return "jQuery(function(){jQuery('#${context.attrs.id}').${'om' + componentName.capitalize()}(${out});});\n"
    }

}
