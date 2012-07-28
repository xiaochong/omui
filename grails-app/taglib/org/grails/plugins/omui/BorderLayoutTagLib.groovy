package org.grails.plugins.omui

class BorderLayoutTagLib extends BaseTagLib {
    static namespace = "om"

    /**
     * @attr id
     *
     * @attr fit
     * @attr spacing
     * @attr hideCollapsBtn
     */
    def borderLayout = { attrs, body ->
        request.borderLayout = []
        doTag('omBorderLayout', attrs, body)
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
     * @attr onCollapse
     * @attr onBeforeCollapse
     * @attr onExpand
     * @attr onBeforeExpand
     * @attr onOpen
     * @attr onBeforeOpen
     * @attr onClose
     * @attr onBeforeClose
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
     * @attr onCollapse
     * @attr onBeforeCollapse
     * @attr onExpand
     * @attr onBeforeExpand
     * @attr onOpen
     * @attr onBeforeOpen
     * @attr onClose
     * @attr onBeforeClose
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
     * @attr onCollapse
     * @attr onBeforeCollapse
     * @attr onExpand
     * @attr onBeforeExpand
     * @attr onOpen
     * @attr onBeforeOpen
     * @attr onClose
     * @attr onBeforeClose
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
     * @attr onCollapse
     * @attr onBeforeCollapse
     * @attr onExpand
     * @attr onBeforeExpand
     * @attr onOpen
     * @attr onBeforeOpen
     * @attr onClose
     * @attr onBeforeClose
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
     * @attr onCollapse
     * @attr onBeforeCollapse
     * @attr onExpand
     * @attr onBeforeExpand
     * @attr onOpen
     * @attr onBeforeOpen
     * @attr onClose
     * @attr onBeforeClose
     *
     */
    def east = {attrs, body ->
        configRegion('east', attrs, body)
    }

    private void configRegion(String region, Map attrs, Closure body) {
        if (request.borderLayout == null) {
            throwTagError("[borderLayout] parent tag must be specified to for <om:${region}>!")
        }
        attrs.region = region
        doTag('omRegionPanel', attrs, body)
    }
}
