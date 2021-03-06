package org.grails.plugins.omui.widget

import org.grails.plugins.omui.Argument
import org.grails.plugins.omui.ContainerWidget
import org.grails.plugins.omui.json.Event
import org.grails.plugins.omui.json.Mixed
import org.springframework.stereotype.Component

@Component("omTabs")
class Tabs extends ContainerWidget {
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

    @Argument(["n", "event"]) Event onActivate
    @Argument(["config", "event"]) Event onAdd
    @Argument(["n", "event"]) Event onBeforeActivate
    @Argument(["config", "event"]) Event onBeforeAdd
    @Argument(["n", "event"]) Event onBeforeClose
    @Argument(["event"]) Event onBeforeCloseAll
    @Argument(["n", "event"]) Event onClose
    @Argument(["event"]) Event onCloseAll
    @Argument(["tabId", "event"]) Event onLoadComplete

    @Override
    String getContainerTag() {
        return 'div'
    }
}
