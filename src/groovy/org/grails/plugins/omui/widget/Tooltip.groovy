package org.grails.plugins.omui.widget

import org.grails.plugins.omui.SelectorWidget
import org.grails.plugins.omui.json.Mixed
import org.springframework.stereotype.Component

@Component("omTooltip")
class Tooltip extends SelectorWidget {

    Boolean anchor
    Mixed anchorOffset
    String contentEL
    Integer delay
    Mixed height
    String html
    Boolean lazyLoad
    Mixed maxHeight
    Mixed maxWidth
    Mixed minHeight
    Mixed minWidth
    Mixed offset
    String region
    String showOn
    Boolean trackMouse
    String url
    Mixed width
}
