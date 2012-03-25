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
}