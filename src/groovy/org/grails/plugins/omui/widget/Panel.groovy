package org.grails.plugins.omui.widget

import org.grails.plugins.omui.Argument
import org.grails.plugins.omui.ContainerWidget
import org.grails.plugins.omui.json.Event
import org.grails.plugins.omui.json.Function
import org.grails.plugins.omui.json.Mixed
import org.springframework.stereotype.Component

@Component("omPanel")
class Panel extends ContainerWidget {
    Boolean closable
    Boolean closed
    Boolean collapsed
    Boolean collapsible
    Boolean header
    Mixed height
    String iconCls
    String loadingMessage
    Function preProcess
    String title
    Mixed tools
    String url
    Mixed width

    @Argument(["event"]) Event onBeforeClose
    @Argument(["event"]) Event onBeforeCollapse
    @Argument(["event"]) Event onBeforeExpand
    @Argument(["event"]) Event onBeforeOpen
    @Argument(["event"]) Event onClose
    @Argument(["event"]) Event onCollapse
    @Argument(["xmlHttpRequest", "textStatus", "errorThrown", "event"]) Event onError
    @Argument(["event"]) Event onExpand
    @Argument(["event"]) Event onOpen
    @Argument(["data", "textStatus", "xmlHttpRequest", "event"]) Event onSuccess

    @Override
    String getContainerTag() {
        return "div"
    }
}
