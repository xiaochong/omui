package org.grails.plugins.omui.editors

import org.grails.plugins.omui.json.Event

import java.beans.PropertyEditorSupport

class EventEditor extends PropertyEditorSupport {

    @Override
    void setAsText(String text) {
        this.setValue(new Event(text))
    }
}