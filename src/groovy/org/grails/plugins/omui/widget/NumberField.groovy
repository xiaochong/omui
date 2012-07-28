package org.grails.plugins.omui.widget

import org.grails.plugins.omui.Argument

import org.grails.plugins.omui.json.Event

import org.grails.plugins.omui.ContainerWidget

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

    @Override
    String getWidgetName() {
        return "numberField"
    }
}
