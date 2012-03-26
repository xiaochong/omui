package org.grails.plugins.omui

class OmuiExtTagLib extends BaseTagLib {

    static namespace = "om"

    /**
     * @attr id
     * @attr tag  HTML Tag. eg. input,a,button
     * @attr type The type of input. eg. submit,button,reset
     *
     * @attr disabled
     * @attr icons
     * @attr label
     * @attr width
     *
     * @attr onClick
     */
    def button = { attrs, body ->
        String containerTag = attrs.remove('tag') ?: 'button'
        if (containerTag == 'input' && !attrs.type) attrs.type = 'button'
        doTag(attrs, body, 'button', containerTag)
    }

    /**
     * @attr selector The css selector of DOM for tip.
     *
     * @attr anchor
     * @attr anchorOffset
     * @attr contentEL
     * @attr delay
     * @attr height
     * @attr html
     * @attr lazyLoad
     * @attr maxHeight
     * @attr maxWidth
     * @attr minHeight
     * @attr minWidth
     * @attr offset
     * @attr region
     * @attr showOn
     * @attr trackMouse
     * @attr url
     * @attr width
     *
     */
    def tooltip = {attrs, body ->
        if (!attrs.selector) throwTagError("[selector] attribute must be specified to for <om:tooltip>!")
        doTag(attrs, body, 'tooltip', '', [selector: attrs.selector])
    }
}