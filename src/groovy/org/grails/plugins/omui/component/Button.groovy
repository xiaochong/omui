package org.grails.plugins.omui.component

import org.grails.plugins.omui.Argument
import org.grails.plugins.omui.ContainerTagComponent
import org.grails.plugins.omui.RenderContext
import org.grails.plugins.omui.json.Event
import org.grails.plugins.omui.json.Mixed

class Button extends ContainerTagComponent {
    transient String tag
    String disabled
    Mixed icons
    String label
    Double width

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

    String getComponentName() {
        return 'button'
    }
}
