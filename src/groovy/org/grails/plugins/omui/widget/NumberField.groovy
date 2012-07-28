package org.grails.plugins.omui.widget

import org.grails.plugins.omui.Argument
import org.grails.plugins.omui.ContainerWidget
import org.grails.plugins.omui.json.Event
import org.springframework.stereotype.Component

@Component("omNumberField")
class NumberField extends ContainerWidget {
    Boolean allowDecimals
    Boolean allowNegative
    Integer decimalPrecision
    Boolean disabled
    Boolean readOnly

    @Argument(["value", "event"]) Event onBlur

    @Override
    String getContainerTag() {
        return "input"
    }
}
