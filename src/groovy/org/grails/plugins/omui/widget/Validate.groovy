package org.grails.plugins.omui.widget

import org.grails.plugins.omui.SelectorWidget
import org.grails.plugins.omui.json.Function
import org.grails.plugins.omui.json.Mixed
import org.springframework.stereotype.Component

@Component("validate")
class Validate extends SelectorWidget {
    String errorClass
    Mixed errorContainer
    String errorElement
    Mixed errorLabelContainer
    Function errorPlacement
    Boolean focusCleanup
    Boolean focusInvalid
    Mixed groups
    String ignore
    Function invalidHandler
    Mixed messages
    Boolean onclick
    Boolean onfocusout
    Boolean onkeyup
    Boolean onsubmit
    Mixed rules
    Function showErrors
    Function submitHandler
    String success
    Boolean validateOnEmpty
    String validClass
    String wrapper
}
