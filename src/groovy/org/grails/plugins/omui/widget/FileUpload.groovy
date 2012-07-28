package org.grails.plugins.omui.widget

import org.grails.plugins.omui.Argument
import org.grails.plugins.omui.ContainerWidget
import org.grails.plugins.omui.json.Event
import org.grails.plugins.omui.json.Mixed
import org.springframework.stereotype.Component

@Component("omFileUpload")
class FileUpload extends ContainerWidget {
    String action
    Mixed actionData
    Boolean autoUpload
    String buttonImg
    String fileDesc
    String fileExt
    Mixed height
    String method
    Boolean multi
    Integer queueSizeLimit
    Boolean removeCompleted
    Integer sizeLimit
    String swf
    Mixed width

    @Argument(['data', 'event']) Event onAllComplete
    @Argument(['id', 'fileObj', 'data', 'event']) Event onCancel
    @Argument(['id', 'fileObj', 'response', 'data', 'event']) Event onComplete
    @Argument(['id', 'fileObj', 'errorObj', 'event']) Event onError
    @Argument(['id', 'fileObj', 'data', 'event']) Event onProgress
    @Argument(['queueSizeLimit', 'event']) Event onQueueFull
    @Argument(['id', 'fileObj', 'event']) Event onSelect

    @Override
    String getContainerTag() {
        return "input"
    }
}
