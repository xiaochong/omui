package org.grails.plugins.omui.widget

import org.grails.plugins.omui.Argument

import org.grails.plugins.omui.json.Event
import org.grails.plugins.omui.json.Mixed

import org.grails.plugins.omui.ContainerWidget

class Slider extends ContainerWidget {
    String activeNavCls
    Integer animSpeed
    Boolean autoPlay
    Mixed controlNav
    Integer delay
    Boolean directionNav
    Mixed effect
    Integer interval
    Boolean pauseOnHover
    Integer startSlide

    @Argument(["index", "event"]) Event onAfterSlide
    @Argument(["index", "event"]) Event onBeforeSlide

    @Override
    String getContainerTag() {
        return "div"
    }

    @Override
    String getWidgetName() {
        return "slider"
    }
}
