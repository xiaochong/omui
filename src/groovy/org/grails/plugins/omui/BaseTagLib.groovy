package org.grails.plugins.omui

import org.springframework.beans.factory.InitializingBean
import org.springframework.context.ApplicationContext
import org.springframework.context.ApplicationContextAware

import javax.servlet.ServletContext
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

protected abstract class BaseTagLib implements InitializingBean, ApplicationContextAware {

    ApplicationContext applicationContext
    private static Map<String, Class<? extends Widget>> widgets = new HashMap<String, Class<? extends Widget>>()

    protected doTag(Map attrs, Closure body, String compName, String containerTag, Map extAttrs = [:]) {
    }

    protected doTag(String widget, Map attrs, Closure body) {
        def comCls = widgets.get(widget)
        def renderContext = new DefaultRenderContext(this, widget, attrs, body)
        comCls.newInstance().doRender(renderContext)
    }

    void afterPropertiesSet() {
        def widgets = applicationContext.getBeansOfType(Widget.class)
        widgets.each {name, widget ->
            registerWidget(name, widget)
        }
    }

    public void registerWidget(String name, Widget widget) {
        widgets.put(name, widget.class)
    }

    static class DefaultRenderContext implements RenderContext {
        def source
        Map _attrs
        Closure _body
        String _widget

        DefaultRenderContext(tagLib, String widget, Map attrs, Closure body) {
            this.source = tagLib
            this._attrs = attrs
            this._body = body
            this._widget = widget
        }

        @Override
        String getWidget() {
            return _widget
        }

        HttpServletRequest getRequest() {
            return source.request
        }

        HttpServletResponse getResponse() {
            return source.response
        }

        ServletContext getServletContext() {
            return source.servletContext
        }

        Closure getBody() {
            return this._body
        }

        Map getAttrs() {
            return this._attrs
        }

        Writer getOut() {
            return source.out
        }

        def getR() {
            return source.r
        }
    }
}
