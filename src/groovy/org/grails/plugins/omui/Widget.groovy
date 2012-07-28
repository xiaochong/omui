package org.grails.plugins.omui

public interface Widget {

    String getWidgetName()

    void doRender(RenderContext context)
}