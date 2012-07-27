package org.grails.plugins.omui.editors

import org.grails.plugins.omui.json.Mixed

import java.beans.PropertyEditorSupport

class MixedEditor extends PropertyEditorSupport {

    @Override
    void setValue(Object value) {
        super.setValue(new Mixed(value))
    }

    @Override
    void setAsText(String text) {
        this.setValue(new Mixed(text))
    }
}