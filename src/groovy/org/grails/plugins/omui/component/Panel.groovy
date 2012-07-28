package org.grails.plugins.omui.component

import org.grails.plugins.omui.Argument
import org.grails.plugins.omui.ContainerTagComponent
import org.grails.plugins.omui.json.Event
import org.grails.plugins.omui.json.Mixed

class Panel extends ContainerTagComponent{
    Boolean closable
    Boolean closed
    Boolean collapsed
    Boolean collapsible
    Boolean header
    Mixed height
    String iconCls
    String loadingMessage
    Mixed preProcess //Function
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
    @Argument(["xmlHttpRequest","textStatus","errorThrown","event"]) Event onError
    @Argument(["event"]) Event onExpand
    @Argument(["event"]) Event onOpen
    @Argument(["data","textStatus","event"]) Event onSuccess

    @Override
    String getContainerTag() {
        return "div"
    }

    @Override
    String getComponentName() {
        return "panel"
    }
}
