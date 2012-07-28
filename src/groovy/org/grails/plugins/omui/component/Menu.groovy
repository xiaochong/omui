package org.grails.plugins.omui.component

import org.grails.plugins.omui.Argument
import org.grails.plugins.omui.ContainerTagComponent
import org.grails.plugins.omui.json.Event

class Menu extends ContainerTagComponent {
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
    String getComponentName() {
        return "menu"
    }
}
