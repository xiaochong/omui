package org.grails.plugins.omui.widget

import org.grails.plugins.omui.ContainerWidget
import org.grails.plugins.omui.json.Mixed
import org.springframework.stereotype.Component

@Component('omButtonbar')
class Buttonbar extends ContainerWidget {
    Mixed width
    Mixed btns

    @Override
    String getContainerTag() {
        return 'div'
    }
}
