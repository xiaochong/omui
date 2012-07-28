package org.grails.plugins.omui.component

import org.grails.plugins.omui.Argument
import org.grails.plugins.omui.ContainerTagComponent
import org.grails.plugins.omui.json.Event
import org.grails.plugins.omui.json.Mixed

class Grid extends ContainerTagComponent {
    Boolean autoFit
    Mixed colModel
    String dataSource
    String editMode
    String emptyMsg
    String errorMsg
    Mixed extraData //JSON
    Integer height
    Integer limit
    String loadingMsg
    String method
    String pageStat
    String pageText
    Mixed preProcess
    Mixed rowClasses
    Boolean showIndex
    Boolean singleSelect
    String title
    Mixed width

    @Argument(["rowIndex", "rowData"]) Event onAfterEdit
    @Argument(["rowIndex", "rowData"]) Event onBeforeEdit
    Event onCancelEdit
    @Argument(["XMLHttpRequest", "textStatus", "errorThrown", "event"]) Event onError
    @Argument(["type", "newPage", "event"]) Event onPageChange
    @Argument(["nowPage", "pageRecords", "event"]) Event onRefresh
    @Argument(["rowIndex", "rowData", "event"]) Event onRowClick
    @Argument(["rowIndex", "rowData", "event"]) Event onRowDblClick
    @Argument(["rowIndex", "rowData", "event"]) Event onRowDeselect
    @Argument(["rowIndex", "rowData", "event"]) Event onRowSelect
    @Argument(["data", "textStatus", "XMLHttpRequest", "event"]) Event onSuccess

    @Override
    String getContainerTag() {
        return "table"
    }

    @Override
    String getComponentName() {
        return "grid"
    }
}
