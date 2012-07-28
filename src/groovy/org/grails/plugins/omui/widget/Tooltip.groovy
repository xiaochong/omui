package org.grails.plugins.omui.widget

import org.grails.plugins.omui.SelectorWidget
import org.grails.plugins.omui.json.Mixed
import org.springframework.stereotype.Component

@Component("omTooltip")
class Tooltip extends SelectorWidget {

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
}
