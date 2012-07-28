package org.grails.plugins.omui.component

import org.grails.plugins.omui.Argument
import org.grails.plugins.omui.ContainerTagComponent
import org.grails.plugins.omui.json.Event
import org.grails.plugins.omui.json.Mixed

class ItemSelector extends ContainerTagComponent {
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
    String getComponentName() {
        return "itemSelector"
    }
}
