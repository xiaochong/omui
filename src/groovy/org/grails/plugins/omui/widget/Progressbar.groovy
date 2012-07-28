package org.grails.plugins.omui.widget

import org.grails.plugins.omui.Argument
import org.grails.plugins.omui.ContainerWidget
import org.grails.plugins.omui.json.Event
import org.grails.plugins.omui.json.Mixed
import org.springframework.stereotype.Component

@Component("omProgressbar")
class Progressbar extends ContainerWidget {
    Mixed text
    Integer value
    Mixed width

    @Argument(["newValue", "oldValue", "event"]) Event onChange

    @Override
    String getContainerTag() {
        return "div"
    }
}
