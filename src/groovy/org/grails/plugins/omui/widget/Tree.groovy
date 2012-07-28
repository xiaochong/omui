package org.grails.plugins.omui.widget

import org.grails.plugins.omui.Argument
import org.grails.plugins.omui.ContainerWidget
import org.grails.plugins.omui.json.Event
import org.grails.plugins.omui.json.Mixed

class Tree extends ContainerWidget {
    Boolean cascadeCheck
    Mixed dataSource
    Boolean draggable
    Boolean showCheckbox
    Boolean showIcon
    Boolean simpleDataModel

    @Argument(["nodeData"]) Event onBeforeCollapse
    @Argument(["nodeData"]) Event onBeforeExpand
    @Argument(["nodeData"]) Event onBeforeLoad
    @Argument(["nodeData"]) Event onBeforeSelect
    @Argument(["nodeData"]) Event onCheck
    @Argument(["nodeData", "event"]) Event onClick
    @Argument(["nodeData"]) Event onCollapse
    @Argument(["nodeData", "event"]) Event onDblClick
    @Argument(["nodeData", "event"]) Event onDrag
    @Argument(["nodeData", "event"]) Event onDrop
    @Argument(["xmlHttpRequest", "textStatus", "errorThrown", "event"]) Event onError
    @Argument(["nodeData"]) Event onExpand
    @Argument(["nodeData", "event"]) Event onRightClick
    @Argument(["nodeData"]) Event onSelect
    @Argument(["data"]) Event onSuccess

    @Override
    String getContainerTag() {
        return "ul"
    }

    @Override
    String getWidgetName() {
        return "tree"
    }
}
