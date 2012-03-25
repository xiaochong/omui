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
    def tabs = { attrs, body ->
        doTag(attrs, body, "tabs")
    }

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
    def button = { attrs, body ->
        doTag(attrs, body, "button")
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
    def accordion = { attrs, body ->
        doTag(attrs, body, "accordion")
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
     */
    def dialog = { attrs, body ->
        doTag(attrs, body, "dialog")
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
     */
    def calendar = { attrs, body ->
        doTag(attrs, body, "calendar", "input")
    }

    /**
     * @attr id
     *
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
     * @attr onError
     * @attr onSuccess
     * @attr onValueChange
     */
    def combo = { attrs, body ->
        doTag(attrs, body, "combo", "input")
    }

    /**
     * @attr id
     *
     * @attr allowDecimals
     * @attr allowNegative
     * @attr decimalPrecision
     * @attr disabled
     * @attr readOnly
     *
     * @attr onBlur
     */
    def numberField = { attrs, body ->
        doTag(attrs, body, "numberField", "input")
    }

    /**
     * @attr id
     *
     * @attr allowImageType
     * @attr basicEntities
     * @attr blockedBrowserKeystrokes
     * @attr docType
     * @attr enableTabKeyTools
     * @attr enterMode
     * @attr filebrowserImageUploadUrl
     * @attr height
     * @attr keystrokes
     * @attr readOnly
     * @attr resizable
     * @attr skin
     * @attr startupFocus
     * @attr startupMode
     * @attr toolbar
     * @attr uiColor
     * @attr undoStackSize
     * @attr width
     *
     * @attr onKeyUp
     */
    def editor = { attrs, body ->
        doTag(attrs, body, "editor", "textarea")
    }

    /**
     * @attr id
     *
     * @attr cacheSize
     * @attr clientFormatter
     * @attr crossDomain
     * @attr dataSource
     * @attr delay
     * @attr disabled
     * @attr listMaxHeight
     * @attr listWidth
     * @attr method
     * @attr minChars
     * @attr preProcess
     * @attr queryName
     * @attr readOnly
     *
     * @attr onBeforeSuggest
     * @attr onError
     * @attr onSelect
     * @attr onSuccess
     * @attr onSuggesting
     */
    def suggestion = { attrs, body ->
        doTag(attrs, body, "suggestion", "input")
    }

    /**
     * @attr id
     *
     * @attr autoSort
     * @attr availableTitle
     * @attr clientFormatter
     * @attr dataSource
     * @attr height
     * @attr preProcess
     * @attr selectedTitle
     * @attr toolbarIcons
     * @attr value
     * @attr width
     *
     * @attr onBeforeItemDeselect
     * @attr onBeforeItemSelect
     * @attr onError
     * @attr onItemDeselect
     * @attr onItemSelect
     * @attr onSort
     * @attr onSuccess
     */
    def itemSelector = { attrs, body ->
        doTag(attrs, body, "itemSelector")
    }

    /**
     * @attr id
     *
     * @attr closable
     * @attr collapsed
     * @attr collapsible
     * @attr header
     * @attr height
     * @attr iconCls
     * @attr loadingMessage
     * @attr preProcess
     * @attr title
     * @attr tools
     * @attr url
     * @attr width
     *
     * @attr onBeforeClose
     * @attr onBeforeCollapse
     * @attr onBeforeExpand
     * @attr onBeforeOpen
     * @attr onClose
     * @attr onCollapse
     * @attr onError
     * @attr onExpand
     * @attr onOpen
     * @attr onSuccess
     */
    def panel = { attrs, body ->
        doTag(attrs, body, "panel")
    }

    /**
     * @attr id
     *
     * @attr autoFit
     * @attr colModel
     * @attr dataSource
     * @attr emptyMsg
     * @attr errorMsg
     * @attr extraData
     * @attr height
     * @attr limit
     * @attr loadingMsg
     * @attr method
     * @attr pageStat
     * @attr pageText
     * @attr preProcess
     * @attr rowClasses
     * @attr showIndex
     * @attr singleSelect
     * @attr title
     * @attr width
     *
     * @attr onError
     * @attr onPageChange
     * @attr onRefresh
     * @attr onRowClick
     * @attr onRowDblClick
     * @attr onRowDeselect
     * @attr onRowSelect
     * @attr onSuccess
     */
    def grid = { attrs, body ->
        doTag(attrs, body, "grid", "table")
    }

    /**
     * @attr id
     *
     * @attr cascadeCheck
     * @attr dataSource
     * @attr draggable
     * @attr showCheckbox
     * @attr showIcon
     * @attr simpleDataModel
     *
     * @attr onBeforeCollapse
     * @attr onBeforeExpand
     * @attr onBeforeLoad
     * @attr onBeforeSelect
     * @attr onCheck
     * @attr onClick
     * @attr onCollapse
     * @attr onDblClick
     * @attr onDrag
     * @attr onDrop
     * @attr onError
     * @attr onExpand
     * @attr onRightClick
     * @attr onSelect
     * @attr onSuccess
     */
    def tree = { attrs, body ->
        doTag(attrs, body, "tree", "ul")
    }

    /**
     * @attr id
     *
     * @attr activeNavCls
     * @attr animSpeed
     * @attr autoPlay
     * @attr controlNav
     * @attr delay
     * @attr directionNav
     * @attr effect
     * @attr interval
     * @attr pauseOnHover
     * @attr startSlide
     *
     * @attr onAfterSlide
     * @attr onBeforeSlide
     */
    def slider = { attrs, body ->
        doTag(attrs, body, "slider")
    }

    /**
     * @attr id
     *
     * @attr contextMenu
     * @attr dataSource
     * @attr maxWidth
     * @attr minWidth
     *
     * @attr onSelect
     */
    def menu = { attrs, body ->
        doTag(attrs, body, "menu")
    }

    /**
     * @attr id
     *
     * @attr text
     * @attr value
     * @attr width
     *
     * @attr onChange
     */
    def progressbar = { attrs, body ->
        doTag(attrs, body, "progressbar")
    }

}