package org.grails.plugins.omui.component

import org.grails.plugins.omui.Argument
import org.grails.plugins.omui.ContainerTagComponent
import org.grails.plugins.omui.json.Event
import org.grails.plugins.omui.json.Mixed

class TabsComponent extends ContainerTagComponent {
    Mixed active
    Boolean autoPlay
    Boolean border
    Mixed closable
    Mixed height
    Integer interval
    Boolean lazyLoad
    Boolean scrollable
    String switchMode
    Mixed tabHeight
    Boolean tabMenu
    Mixed tabWidth
    Mixed width

    @Argument(["n", "event"])
    Event onClose

    @Override
    String getComponentName() {
        return 'Tabs'
    }

    @Override
    String getContainerTag() {
        return 'div'
    }
}
