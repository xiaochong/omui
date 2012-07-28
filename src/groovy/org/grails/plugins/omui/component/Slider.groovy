package org.grails.plugins.omui.component

import org.grails.plugins.omui.Argument
import org.grails.plugins.omui.ContainerTagComponent
import org.grails.plugins.omui.json.Event
import org.grails.plugins.omui.json.Mixed

class Slider extends ContainerTagComponent{
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

    @Argument(["index","event"]) Event onAfterSlide
    @Argument(["index","event"]) Event onBeforeSlide

    @Override
    String getContainerTag() {
        return "div"
    }

    @Override
    String getComponentName() {
        return "slider"
    }
}
