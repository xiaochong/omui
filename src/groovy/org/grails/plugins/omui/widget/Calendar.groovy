package org.grails.plugins.omui.widget

import org.grails.plugins.omui.Argument
import org.grails.plugins.omui.ContainerWidget
import org.grails.plugins.omui.json.Event
import org.grails.plugins.omui.json.Function
import org.grails.plugins.omui.json.Mixed
import org.springframework.stereotype.Component

@Component("omCalendar")
class Calendar extends ContainerWidget {
    Date date
    String dateFormat
    Boolean disabled
    Mixed disabledDays
    Function disabledFn //Function
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
}
