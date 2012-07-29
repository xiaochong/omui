package org.grails.plugins.omui.widget.borderlayout

import org.grails.plugins.omui.BaseWidget
import org.grails.plugins.omui.RenderContext
import org.grails.plugins.omui.json.Event
import org.grails.plugins.omui.json.Mixed
import org.springframework.stereotype.Component

@Component("omRegionPanel")
class RegionPanel extends BaseWidget {
    String id
    String title
    String region
    Boolean resizable
    Boolean collapsible
    Boolean closable
    Mixed height
    Mixed width
    Boolean header
    Boolean expandToBottom

    Event onCollapse
    Event onBeforeCollapse
    Event onExpand
    Event onBeforeExpand
    Event onOpen
    Event onBeforeOpen
    Event onClose
    Event onBeforeClose


    void doRender(RenderContext context) {
        init(context)
        def request = context.request
        request.borderLayout << this
        def remainAttributes = context.attrs.findAll {
            if ('selector' == it.key) return false
            if ('class' == it.key) return true
            else return !this.metaClass.hasProperty(this, it.key.toString())
        }
        def outputAttributeContent = remainAttributes.collect {k, v ->
            "$k=\"${v?.encodeAsHTML()}\""
        }.join(' ')
        context.out << """<div id="${this.id}" ${outputAttributeContent}>${context.body()}</div>"""
    }
}
