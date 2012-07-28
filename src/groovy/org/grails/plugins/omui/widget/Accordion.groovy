package org.grails.plugins.omui.widget

import org.grails.plugins.omui.Argument
import org.grails.plugins.omui.ContainerWidget
import org.grails.plugins.omui.json.Event
import org.grails.plugins.omui.json.Mixed

class Accordion extends ContainerWidget {
    Mixed active
    Boolean autoPlay
    Boolean collapsible
    Boolean disabled
    String header
    Mixed height
    String iconCls
    Integer interval
    Boolean switchEffect
    String switchMode
    Mixed width

    @Argument(["index", "event"]) Event onActivate
    @Argument(["index", "event"]) Event onBeforeActivate
    @Argument(["index", "event"]) Event onBeforeCollapse
    @Argument(["index", "event"]) Event onCollapse

    @Override
    String getContainerTag() {
        return "div"
    }

    String getWidgetName() {
        return "accordion"
    }
}
