package org.grails.plugins.omui

abstract class ContainerWidget extends BaseWidget {

    abstract String getContainerTag()

    void doRender(RenderContext context) {
        init(context)
        def html = getHtml(context)
        def script = getScript(context)
        context.out << html
        context.r.script { return "$script\n"}
    }

    String getHtml(RenderContext context) {
        def attrs = context.attrs
        def remainAttributes = attrs.findAll {
            if ('selector' == it.key) return false
            if ('class' == it.key) return true
            else return !this.metaClass.hasProperty(this, it.key.toString())
        }
        def outputAttributeContent = remainAttributes.collect {k, v ->
            "$k=\"${v?.encodeAsHTML()}\""
        }.join(' ')
        return """<${containerTag} ${outputAttributeContent}>${context.body()}</${containerTag}>"""
    }

}
