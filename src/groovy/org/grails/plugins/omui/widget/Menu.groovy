package org.grails.plugins.omui.widget

import org.grails.plugins.omui.Argument
import org.grails.plugins.omui.ContainerWidget
import org.grails.plugins.omui.json.Event
import org.grails.plugins.omui.json.Mixed
import org.springframework.stereotype.Component

@Component('omMenu')
class Menu extends ContainerWidget {
    Boolean contextMenu
    Mixed dataSource
    Mixed maxWidth
    Mixed minWidth

    @Argument(["item", "event"]) Event onSelect

    @Override
    String getContainerTag() {
        return "div"
    }
}
