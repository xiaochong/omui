package org.grails.plugins.omui.widget

import org.grails.plugins.omui.Argument
import org.grails.plugins.omui.SelectorWidget
import org.grails.plugins.omui.json.Event
import org.grails.plugins.omui.json.Mixed
import org.springframework.stereotype.Component

@Component("omDraggable")
class Draggable extends SelectorWidget {
    String axis
    String cancel
    Mixed containment
    String cursor
    Boolean disabled
    String handle
    Mixed helper
    Mixed revert
    Boolean scroll

    @Argument(["ui", "event"]) Event onDrag
    @Argument(["ui", "event"]) Event onStart
    @Argument(["ui", "event"]) Event onStop
}
