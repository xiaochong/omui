package org.grails.plugins.omui.widget

import org.grails.plugins.omui.ContainerWidget
import org.grails.plugins.omui.RenderContext
import org.grails.plugins.omui.widget.borderlayout.RegionPanel
import org.springframework.stereotype.Component

@Component("omBorderLayout")
class BorderLayout extends ContainerWidget {
    Boolean fit
    Boolean hideCollapsBtn
    List<RegionPanel> panels
    Integer spacing

    @Override
    String getContainerTag() {
        return "div"
    }

    @Override
    void doRender(RenderContext context) {
        panels = []
        init(context)
        def html = getHtml(context)
        context.request.borderLayout.each {
            panels << it
        }
        context.request.removeAttribute('borderLayout')
        def script = getScript(context)
        context.out << html
        context.r.script { return "$script\n"}
    }
}
