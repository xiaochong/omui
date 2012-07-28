package org.grails.plugins.omui.component

import org.grails.plugins.omui.Argument
import org.grails.plugins.omui.ContainerTagComponent
import org.grails.plugins.omui.json.Event
import org.grails.plugins.omui.json.Mixed

class Calendar extends ContainerTagComponent {
    Date date
    String dateFormat
    Boolean disabled
    Mixed disabledDays
    Mixed disabledFn //Function
    Boolean editable
    Date maxDate
    Date minDate
    Integer pages
    Boolean popup
    Boolean readOnly
    Boolean showTime
    Integer startDay

    @Argument(["date", "event"]) Event onSelect

    @Override
    String getContainerTag() {
        return "input"
    }

    @Override
    String getComponentName() {
        return "calendar"
    }
}
