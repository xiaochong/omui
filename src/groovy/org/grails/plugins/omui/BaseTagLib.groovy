package org.grails.plugins.omui

import org.springframework.beans.factory.InitializingBean

import javax.servlet.ServletContext
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

import org.grails.plugins.omui.component.*

protected abstract class BaseTagLib implements InitializingBean {

    private static Map<String, Class<? extends Component>> components = new HashMap<String, Class<? extends Component>>()
    public static final DEFAULT_COMPONENTS = [Tabs, Accordion, Button, FileUpload, Tooltip]

    protected doTag(Map attrs, Closure body, String compName, String containerTag, Map extAttrs = [:]) {
    }

    protected doTag(String componentName, Map attrs, Closure body) {
        def comCls = components.get(componentName)
        def renderContext = new DefaultRenderContext(this, attrs, body)
        comCls.newInstance().doRender(renderContext)
    }

    void afterPropertiesSet() {
        DEFAULT_COMPONENTS.each {
            def component = it.newInstance()
            registerComponent(component)
        }
    }

    public void registerComponent(Component component) {
        components.put(component.componentName, component.class)
    }

    static class DefaultRenderContext implements RenderContext {
        def source
        Map _attrs
        Closure _body

        DefaultRenderContext(tagLib, Map attrs, Closure body) {
            this.source = tagLib
            this._attrs = attrs
            this._body = body
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
