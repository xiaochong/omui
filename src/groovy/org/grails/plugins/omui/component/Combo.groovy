package org.grails.plugins.omui.component

import org.grails.plugins.omui.Argument
import org.grails.plugins.omui.ContainerTagComponent
import org.grails.plugins.omui.json.Event
import org.grails.plugins.omui.json.Mixed

class Combo extends ContainerTagComponent {
    Boolean autoFilter
    Mixed dataSource
    Boolean disabled
    Boolean editable
    String emptyText
    Integer filterDelay
    Mixed filterStrategy
    Boolean forceSelection
    Mixed inputField
    Boolean lazyLoad
    Boolean listAutoWidth
    Integer listMaxHeight
    Mixed listProvider //Function
    Boolean multi
    String multiSeparator
    Mixed optionField
    Boolean readOnly
    String value
    Mixed valueField
    String width

    @Argument(["xmlHttpRequest", "textStatus", "errorThrown", "event"]) Event onError
    @Argument(["data", "textStatus", "event"]) Event onSuccess
    @Argument(["target", "newValue", "oldValue", "event"]) Event onValueChange

    @Override
    String getContainerTag() {
        return "input"
    }

    @Override
    String getComponentName() {
        return "combo"
    }
}
