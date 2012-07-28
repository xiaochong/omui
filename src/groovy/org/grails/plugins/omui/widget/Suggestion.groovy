package org.grails.plugins.omui.widget

import org.grails.plugins.omui.Argument
import org.grails.plugins.omui.ContainerWidget
import org.grails.plugins.omui.json.Event
import org.grails.plugins.omui.json.Mixed
import org.springframework.stereotype.Component

@Component("omSuggestion")
class Suggestion extends ContainerWidget {

    Integer cacheSize
    Mixed clientFormatter //Function
    Boolean crossDomain
    String dataSource
    Integer delay
    Boolean disabled
    Integer listMaxHeight
    Integer listWidth
    String method
    Integer minChars
    Mixed preProcess //Function
    String queryName
    Boolean readOnly

    @Argument(["text", "event"]) Event onBeforeSuggest
    @Argument(["xmlHttpRequest", "textStatus", "errorThrown", "event"]) Event onError
    @Argument(["text", "rowData", "index", "event"]) Event onSelect
    @Argument(["data", "textStatus", "event"]) Event onSuccess
    @Argument(["text", "event"]) Event onSuggesting


    @Override
    String getContainerTag() {
        return "input"
    }
}
