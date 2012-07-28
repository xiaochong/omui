package org.grails.plugins.omui.widget

import org.grails.plugins.omui.Argument
import org.grails.plugins.omui.SelectorWidget
import org.grails.plugins.omui.json.Event
import org.grails.plugins.omui.json.Mixed
import org.springframework.stereotype.Component

@Component("omDroppable")
class Droppable extends SelectorWidget {
    Mixed accept
    String activeClass
    Boolean disabled
    Boolean greedy
    String hoverClass

    @Argument(['source', 'event']) Event onDragOut
    @Argument(['source', 'event']) Event onDragOver
    @Argument(['source', 'event']) Event onDragStart
    @Argument(['source', 'event']) Event onDrop
}
