package org.grails.plugins.omui

protected abstract class BaseTagLib {

    AttitudeTypeService attitudeTypeService

    protected doTag(Map attrs, Closure body, String compName, String containerTag, Map extAttrs = [:]) {
        def id = attrs.remove('id') ?: UUID.randomUUID().toString()
        def selector = extAttrs.remove('selector') ?: "#${id}"
        def noOmPrefix = extAttrs.remove('noOmPrefix')
        def remainAttributes = [:]
        def config = attitudeTypeService.attrsToConfig(compName, attrs, remainAttributes)
        def configJson = attitudeTypeService.configToJson(config)
        def outputAttributeContent = remainAttributes.collect {k, v ->
            "$k=\"${v?.encodeAsHTML()}\""
        }.join(' ')
        if (containerTag) {
            out << """<${containerTag} id="${id}" ${outputAttributeContent}>${body()}</${containerTag}>"""
        }
        r.script {
            return "jQuery(function(){jQuery('${selector}').${noOmPrefix ? compName : 'om' + compName.capitalize()}(${configJson});});\n"
        }
    }
}
