package org.grails.plugins.omui.component

import org.grails.plugins.omui.SelectorTagComponent
import org.grails.plugins.omui.json.Mixed


class Tooltip extends SelectorTagComponent {

    Boolean anchor
    Double anchorOffset
    String contentEL
    Integer delay
    Double height
    String html
    Boolean lazyLoad
    Double maxHeight
    Double maxWidth
    Double minHeight
    Double minWidth
    Mixed offset
    String region
    String showOn
    Boolean trackMouse
    String url
    Double width

    String getComponentName() {
        return 'tooltip'
    }
}
