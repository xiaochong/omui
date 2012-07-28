package org.grails.plugins.omui.editors

import org.grails.plugins.omui.json.Function

import java.beans.PropertyEditorSupport

class FunctionEditor extends PropertyEditorSupport {

    @Override
    void setAsText(String text) {
        this.setValue(new Function(text))
    }
}
