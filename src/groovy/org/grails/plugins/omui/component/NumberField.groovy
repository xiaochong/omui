package org.grails.plugins.omui.component

import org.grails.plugins.omui.Argument
import org.grails.plugins.omui.ContainerTagComponent
import org.grails.plugins.omui.json.Event
import org.grails.plugins.omui.json.Mixed

class NumberField extends ContainerTagComponent{
    Boolean allowDecimals
    Boolean allowNegative
    Integer decimalPrecision
    Boolean disabled
    Boolean readOnly

    @Argument(["value","event"]) Event onBlur

    @Override
    String getContainerTag() {
        return "input"
    }

    @Override
    String getComponentName() {
        return "numberField"
    }
}
