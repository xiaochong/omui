package org.grails.plugins.omui.widget

import org.grails.plugins.omui.Argument
import org.grails.plugins.omui.ContainerWidget
import org.grails.plugins.omui.RenderContext
import org.grails.plugins.omui.json.Event
import org.grails.plugins.omui.json.Mixed
import org.springframework.stereotype.Component

@Component("omButton")
class Button extends ContainerWidget {
    transient String tag
    String disabled
    Mixed icons
    String label
    Mixed width

    @Argument(['event']) Event onClick

    @Override
    void init(RenderContext context) {
        this.tag = context.attrs.remove('tag')
        super.init(context)
    }

    @Override
    String getContainerTag() {
        return tag
    }
}
