package org.grails.plugins.omui

class OmuiTagLib extends BaseTagLib {
    static namespace = "om"

    /**
     * @attr id
     *
     * @attr active
     * @attr autoPlay
     * @attr border
     * @attr closable
     * @attr height
     * @attr interval
     * @attr lazyLoad
     * @attr scrollable
     * @attr switchMode
     * @attr tabHeight
     * @attr tabWidth
     * @attr width
     *
     * @attr onActivate
     * @attr onAdd
     * @attr onBeforeActivate
     * @attr onBeforeAdd
     * @attr onBeforeClose
     * @attr onBeforeCloseAll
     * @attr onClose
     * @attr onCloseAll
     * @attr onLoadComplete
     */
    def tabs = {attrs, body ->
        doTag(attrs, body, 'tabs')
    }

    /**
     * @attr id
     *
     * @attr active
     * @attr autoPlay
     * @attr collapsible
     * @attr disabled
     * @attr height
     * @attr iconCls
     * @attr interval
     * @attr switchEffect
     * @attr switchMode
     * @attr width
     *
     * @attr onActivate
     * @attr onBeforeActivate
     * @attr onBeforeCollapse
     * @attr onCollapse
     */
    def accordion = {attrs, body ->
        doTag(attrs, body, 'accordion')
    }

    /**
     * @attr id
     *
     * @attr autoOpen
     * @attr buttons
     * @attr closeOnEscape
     * @attr dialogClass
     * @attr draggable
     * @attr height
     * @attr maxHeight
     * @attr maxWidth
     * @attr minHeight
     * @attr minWidth
     * @attr modal
     * @attr resizable
     * @attr title
     * @attr width
     *
     * @attr onBeforeClose
     * @attr onClose
     * @attr onOpen
     *
     */
    def dialog = {attrs, body ->
        doTag(attrs, body, 'dialog')
    }

    /**
     * @attr id
     *
     * @attr date
     * @attr dateFormat
     * @attr disabled
     * @attr disabledDays
     * @attr disabledFn
     * @attr editable
     * @attr maxDate
     * @attr minDate
     * @attr pages
     * @attr popup
     * @attr readOnly
     * @attr showTime
     * @attr startDay
     *
     * @attr onSelect
     *
     */
    def calendar = {attrs, body ->
        doTag(attrs, body, 'calendar', 'input')
    }

    /**
     * @attr autoFilter
     * @attr dataSource
     * @attr disabled
     * @attr editable
     * @attr emptyText
     * @attr filterDelay
     * @attr filterStrategy
     * @attr inputField
     * @attr lazyLoad
     * @attr listAutoWidth
     * @attr listMaxHeight
     * @attr listProvider
     * @attr multi
     * @attr multiSeparator
     * @attr optionField
     * @attr readOnly
     * @attr value
     * @attr valueField
     * @attr width
     *
     */
    def combo = {attrs, body ->
        doTag(attrs, body, 'combo', 'input')
    }

}
