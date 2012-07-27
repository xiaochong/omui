package org.grails.plugins.omui

public interface Component {

    String getComponentName()

    void doRender(RenderContext context)
}