package org.grails.plugins.omui.component

import org.grails.plugins.omui.Argument
import org.grails.plugins.omui.ContainerTagComponent
import org.grails.plugins.omui.json.Event
import org.grails.plugins.omui.json.Mixed

class FileUpload extends ContainerTagComponent {
    String action
    Mixed actionData
    Boolean autoUpload
    String buttonImg
    String fileDesc
    String fileExt
    Double height
    String method
    Boolean multi
    Integer queueSizeLimit
    Boolean removeCompleted
    Integer sizeLimit
    String swf
    Double width

    @Argument(['data', 'event']) Event onAllComplete
    @Argument(['ID', 'fileObj', 'data', 'event']) Event onCancel
    @Argument(['ID', 'fileObj', 'response', 'data', 'event']) Event onComplete
    @Argument(['ID', 'fileObj', 'errorObj', 'event']) Event onError
    @Argument(['ID', 'fileObj', 'data', 'event']) Event onProgress
    @Argument(['queueSizeLimit', 'event']) Event onQueueFull
    @Argument(['ID', 'fileObj', 'event']) Event onSelect

    @Override
    String getContainerTag() {
        return "input"
    }

    String getComponentName() {
        return 'fileUpload'
    }
}
