package org.grails.plugins.omui.widget

import org.grails.plugins.omui.Argument

import org.grails.plugins.omui.json.Event
import org.grails.plugins.omui.ContainerWidget

class Menu extends ContainerWidget {
    Boolean contextMenu
    String dataSource
    Integer maxWidth
    Integer minWidth

    @Argument(["item", "event"]) Event onSelect

    @Override
    String getContainerTag() {
        return "div"
    }

    @Override
    String getWidgetName() {
        return "menu"
    }
}
