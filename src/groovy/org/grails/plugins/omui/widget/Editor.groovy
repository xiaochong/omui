package org.grails.plugins.omui.widget

import org.grails.plugins.omui.Argument
import org.grails.plugins.omui.ContainerWidget
import org.grails.plugins.omui.json.Event
import org.grails.plugins.omui.json.Mixed
import org.springframework.stereotype.Component

@Component("omEditor")
class Editor extends ContainerWidget {
    Mixed allowImageType
    Boolean basicEntities
    Mixed blockedBrowserKeystrokes
    String docType
    Boolean enableTabKeyTools
    Integer enterMode
    String filebrowserImageUploadUrl
    Integer height
    Mixed keystrokes
    Boolean readOnly
    Boolean resizable
    String skin
    Boolean startupFocus
    String startupMode
    Mixed toolbar
    String uiColor
    Integer undoStackSize
    Mixed width

    @Argument(["event"]) Event onKeyUp

    @Override
    String getContainerTag() {
        return "textarea"
    }
}
