package org.grails.plugins.omui

import com.alibaba.fastjson.serializer.JSONSerializer
import com.alibaba.fastjson.serializer.PropertyFilter
import com.alibaba.fastjson.serializer.SerializeConfig
import com.alibaba.fastjson.serializer.SerializeWriter
import org.codehaus.groovy.grails.web.util.StreamCharBuffer
import org.grails.plugins.omui.editors.EventEditor
import org.grails.plugins.omui.editors.MixedEditor
import org.grails.plugins.omui.json.Event
import org.grails.plugins.omui.json.Mixed
import org.grails.plugins.omui.serializer.JsDateFormatSerializer
import org.springframework.beans.BeanWrapperImpl

abstract class BaseWidget implements Widget {
    final static ArrayList<String> EXCLUDE_NAMES = ['widgetName', 'containerTag', 'metaClass']
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

    void init(RenderContext context) {
        context.attrs.id = context.attrs.id ?: UUID.randomUUID().toString()
        if (!context.attrs.selector) {
            context.attrs.selector = "#${context.attrs.id}"
        }
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
                    if (value instanceof StreamCharBuffer) {
                        value = value.toString()
                    }
                    beanWrapper.setPropertyValue(key, value)
                }
            }
        }
    }


    String getScript(RenderContext context) {
        def selector = context.attrs.remove('selector')
        SerializeWriter out = new SerializeWriter()
        JSONSerializer serializer = new JSONSerializer(out, serializeConfig)
        serializer.getPropertyFilters().add(propertyFilter)
        serializer.write(this)
        return "jQuery(function(){jQuery('${selector}').${'om' + widgetName.capitalize()}(${out});});\n"
    }
}
