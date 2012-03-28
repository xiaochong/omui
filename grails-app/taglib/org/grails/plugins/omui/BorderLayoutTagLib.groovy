package org.grails.plugins.omui

class BorderLayoutTagLib {
    static namespace = "om"

    def attitudeTypeService
    /**
     * @attr id
     *
     * @attr fit
     * @attr spacing
     */
    def borderLayout = { attrs, body ->
        request.borderLayout = [:]
        body.call()
        def id = attrs.remove('id') ?: UUID.randomUUID().toString()
        def panels = [:]
        request.borderLayout.each {key, value ->
            panels[key] = request.borderLayout[key]
        }
        request.removeAttribute('borderLayout')
        def panelBodyMap = [:]
        attrs.panels = panels.inject([]) {List list, Map.Entry<String, Map> entry ->
            panelBodyMap[entry.key] = entry.value.remove('body')
            list << attitudeTypeService.attrsToConfig(entry.key, entry.value, [:])
            return list
        }
        def remainAttributes = [:]
        def config = attitudeTypeService.attrsToConfig('borderLayout', attrs, remainAttributes)
        def outputAttributeContent = remainAttributes.collect {k, v ->
            "$k=\"${v?.encodeAsHTML()}\""
        }.join(' ')
        out << """<div id="${id}" ${outputAttributeContent}>"""
        panels.each {key, attr ->
            def panelBody = panelBodyMap[key]
            out << """<div id="${attr.id}">${panelBody}</div>"""
        }
        out << "</div>"
        def configJson = attitudeTypeService.configToJson(config)
        r.script {
            return "jQuery(function(){jQuery('#${id}').omBorderLayout(${configJson});});\n"
        }
    }

    /**
     * @attr id
     *
     * @attr title
     * @attr header
     * @attr resizable
     * @attr collapsible
     * @attr closable
     * @attr height
     * @attr width
     *
     */
    def north = {attrs, body ->
        configRegion('north', attrs, body)
    }

    /**
     * @attr id
     *
     * @attr title
     * @attr header
     * @attr resizable
     * @attr collapsible
     * @attr closable
     * @attr height
     * @attr width
     *
     */
    def south = {attrs, body ->
        configRegion('south', attrs, body)
    }

    /**
     * @attr id
     *
     * @attr title
     * @attr header
     * @attr resizable
     * @attr collapsible
     * @attr closable
     * @attr height
     * @attr width
     *
     */
    def west = {attrs, body ->
        configRegion('west', attrs, body)
    }

    /**
     * @attr id
     *
     * @attr title
     * @attr header
     * @attr resizable
     * @attr collapsible
     * @attr height
     *
     */
    def center = {attrs, body ->
        configRegion('center', attrs, body)
    }

    /**
     * @attr id
     *
     * @attr title
     * @attr header
     * @attr resizable
     * @attr collapsible
     * @attr closable
     * @attr height
     * @attr width
     *
     */
    def east = {attrs, body ->
        configRegion('east', attrs, body)
    }

    private void configRegion(String region, Map attrs, Closure body) {
        if (request.borderLayout == null) {
            throwTagError("[borderLayout] parent tag must be specified to for <om:${region}>!")
        }
        attrs.id = attrs.id ?: UUID.randomUUID().toString()
        attrs.region = region
        attrs.body = body.call()
        request.borderLayout[region] = attrs
    }
}
