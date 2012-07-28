package org.grails.plugins.omui.component

import org.grails.plugins.omui.ContainerTagComponent
import org.grails.plugins.omui.json.Mixed
import org.grails.plugins.omui.Argument
import org.grails.plugins.omui.json.Event

class Dialog extends ContainerTagComponent{
    Boolean autoOpen
    Mixed buttons
    Boolean closeOnEscape
    String dialogClass
    Boolean draggable
    Integer height
    Integer maxHeight
    Integer maxWidth
    Integer minHeight
    Integer minWidth
    Boolean modal
    Boolean resizable
    String title
    Integer width
    Integer zIndex

    @Argument(["event"]) Event onBeforeClose
    @Argument(["event"]) Event onClose
    @Argument(["event"]) Event onOpen

    @Override
    String getContainerTag() {
        return "div"
    }

    @Override
    String getComponentName() {
        return "dialog"
    }
}
