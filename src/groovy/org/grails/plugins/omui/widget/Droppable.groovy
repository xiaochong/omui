package org.grails.plugins.omui.widget

import org.grails.plugins.omui.Argument
import org.grails.plugins.omui.SelectorWidget
import org.grails.plugins.omui.json.Mixed
import org.springframework.stereotype.Component

@Component("omDroppable")
class Droppable extends SelectorWidget {
    Mixed accept
    String activeClass
    Boolean disabled
    Boolean greedy
    String hoverClass

    @Argument(['source', 'event']) onDragOut
    @Argument(['source', 'event']) onDragOver
    @Argument(['source', 'event']) onDragStart
    @Argument(['source', 'event']) onDrop
}
