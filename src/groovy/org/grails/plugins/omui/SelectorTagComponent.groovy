package org.grails.plugins.omui

abstract class SelectorTagComponent extends BaseTagComponent {

    @Override
    void init(RenderContext context) {
        context.attrs.selector = "${context.attrs.remove('selector')}"
        super.init(context)
    }

    void doRender(RenderContext context) {
        init(context)
        def script = getScript(context)
        context.r.script { return "$script\n"}
    }

}
