package org.grails.plugins.omui.widget

import org.grails.plugins.omui.Argument

import org.grails.plugins.omui.json.Event
import org.grails.plugins.omui.json.Mixed
import org.grails.plugins.omui.ContainerWidget

class ItemSelector extends ContainerWidget {
    Boolean autoSort
    String availableTitle
    Mixed clientFormatter //Function
    Mixed dataSource
    String height
    Mixed preProcess    //Function
    String selectedTitle
    Mixed value
    String width

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

    @Override
    String getWidgetName() {
        return "itemSelector"
    }
}
