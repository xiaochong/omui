package org.grails.plugins.omui.widget

import org.grails.plugins.omui.Argument
import org.grails.plugins.omui.ContainerWidget
import org.grails.plugins.omui.json.Event
import org.grails.plugins.omui.json.Mixed
import org.springframework.stereotype.Component

@Component("omDialog")
class Dialog extends ContainerWidget {
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
}
