package org.grails.plugins.omui

import javax.servlet.ServletContext
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

public interface RenderContext {
    HttpServletRequest getRequest()

    HttpServletResponse getResponse()

    ServletContext getServletContext()

    Closure getBody()

    Map getAttrs()

    Writer getOut()

    def getR()
}