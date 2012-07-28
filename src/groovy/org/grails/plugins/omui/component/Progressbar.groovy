package org.grails.plugins.omui.component

import org.grails.plugins.omui.Argument
import org.grails.plugins.omui.ContainerTagComponent
import org.grails.plugins.omui.json.Event
import org.grails.plugins.omui.json.Mixed

class Progressbar extends ContainerTagComponent{
    Mixed text
    Integer value
    Mixed width

    @Argument(["newValue","oldValue","event"]) Event onChange

    @Override
    String getContainerTag() {
        return "div"
    }

    @Override
    String getComponentName() {
        return "progressbar"
    }
}
