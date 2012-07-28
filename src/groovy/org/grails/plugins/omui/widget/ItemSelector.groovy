package org.grails.plugins.omui.widget

import org.grails.plugins.omui.Argument
import org.grails.plugins.omui.ContainerWidget
import org.grails.plugins.omui.json.Event
import org.grails.plugins.omui.json.Function
import org.grails.plugins.omui.json.Mixed
import org.springframework.stereotype.Component

@Component('omItemSelector')
class ItemSelector extends ContainerWidget {
    Boolean autoSort
    String availableTitle
    Function clientFormatter
    Mixed dataSource
    Mixed height
    Function preProcess
    String selectedTitle
    Mixed value
    Mixed width

    @Argument(["itemDatas", "event"]) Event onBeforeItemDeselect
    @Argument(["itemDatas", "event"]) Event onBeforeItemSelect
    @Argument(["xmlHttpRequest", "textStatus", "errorThrown", "event"]) Event onError
    @Argument(["itemDatas", "event"]) Event onItemDeselect
    @Argument(["itemDatas", "event"]) Event onItemSelect
    @Argument(["data", "textStatus", "event"]) Event onSuccess

    @Override
    String getContainerTag() {
        return "div"
    }
}
