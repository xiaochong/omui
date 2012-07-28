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
        doTag("omTabs", attrs, body)
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
     * @attr onActivate
     * @attr onBeforeActivate
     * @attr onBeforeCollapse
     * @attr onCollapse
     */
    def accordion = { attrs, body ->
        doTag("omAccordion", attrs, body)
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
     * @attr onBeforeClose
     * @attr onClose
     * @attr onOpen
     */
    def dialog = { attrs, body ->
        doTag("omDialog", attrs, body)
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
     * @attr onSelect
     */
    def calendar = { attrs, body ->
        doTag("omCalendar", attrs, body)
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
     * @attr onError
     * @attr onSuccess
     * @attr onValueChange
     */
    def combo = { attrs, body ->
        doTag("omCombo", attrs, body)
    }

    /**
     * @attr id
     *
     * @attr allowDecimals
     * @attr allowNegative
     * @attr decimalPrecision
     * @attr disabled
     * @attr readOnly
     * @attr onBlur
     */
    def numberField = { attrs, body ->
        doTag("omNumberField", attrs, body)
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
     * @attr onKeyUp
     */
    def editor = { attrs, body ->
        doTag("omEditor", attrs, body)
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
     * @attr onBeforeSuggest
     * @attr onError
     * @attr onSelect
     * @attr onSuccess
     * @attr onSuggesting
     */
    def suggestion = { attrs, body ->
        doTag("omSuggestion", attrs, body)
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
     * @attr onBeforeItemDeselect
     * @attr onBeforeItemSelect
     * @attr onError
     * @attr onItemDeselect
     * @attr onItemSelect
     * @attr onSort
     * @attr onSuccess
     */
    def itemSelector = { attrs, body ->
        doTag("omItemSelector", attrs, body)
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
        doTag("omPanel", attrs, body)
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
        doTag("omGrid", attrs, body)
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
        doTag("omTree", attrs, body)
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
     * @attr onAfterSlide
     * @attr onBeforeSlide
     */
    def slider = { attrs, body ->
        doTag("omSlider", attrs, body)
    }

    /**
     * @attr id
     *
     * @attr contextMenu
     * @attr dataSource
     * @attr maxWidth
     * @attr minWidth
     * @attr onSelect
     */
    def menu = { attrs, body ->
        doTag("omMenu", attrs, body)
    }

    /**
     * @attr id
     *
     * @attr text
     * @attr value
     * @attr width
     * @attr onChange
     */
    def progressbar = { attrs, body ->
        doTag("omProgressbar", attrs, body)
    }

    /**
     * @attr id
     *
     * @attr disabled
     * @attr icons
     * @attr label
     * @attr width
     * @attr onClick
     */
    def button = { attrs, body ->
        attrs.tag = attrs.tag ?: 'button'
        if (attrs.tag == 'input' && !attrs.type) attrs.type = 'button'
        doTag('omButton', attrs, body)
    }

    /**
     * @attr id
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
    def tooltip = { attrs, body ->
        if (!attrs.selector) throwTagError("[selector] attribute must be specified to for <om:tooltip>!")
        doTag('omTooltip', attrs, body)
    }

    /**
     * @attr id
     *
     * @attr action
     * @attr actionData
     * @attr autoUpload
     * @attr buttonImg
     * @attr fileDesc
     * @attr fileExt
     * @attr height
     * @attr method
     * @attr multi
     * @attr queueSizeLimit
     * @attr removeCompleted
     * @attr sizeLimit
     * @attr swf
     * @attr width
     * @attr onAllComplete
     * @attr onCancel
     * @attr onComplete
     * @attr onError
     * @attr onProgress
     * @attr onQueueFull
     * @attr onSelect
     */
    def fileUpload = { attrs, body ->
        attrs.type = "file"
        attrs.swf = attrs.swf ?: resource(plugin: 'omui', dir: 'operamasks-ui/swf', file: 'om-fileupload.swf')
        doTag("omFileUpload", attrs, body)
    }

    /**
     * @attr selector
     *
     * @attr errorClass
     * @attr errorContainer
     * @attr errorElement
     * @attr errorLabelContainer
     * @attr errorPlacement
     * @attr focusCleanup
     * @attr focusInvalid
     * @attr groups
     * @attr ignore
     * @attr invalidHandler
     * @attr messages
     * @attr onclick
     * @attr onfocusout
     * @attr onkeyup
     * @attr onsubmit
     * @attr rules
     * @attr showErrors
     * @attr submitHandler
     * @attr success
     * @attr validClass
     * @attr wrapper
     *
     */
    def validate = { attrs, body ->
        if (!attrs.selector) throwTagError("[selector] attribute must be specified to for <om:validate>!")
        doTag('validate', attrs, body)
    }

    /**
     * @attr selector
     *
     * @attr axis
     * @attr cancel
     * @attr containment
     * @attr cursor
     * @attr disabled
     * @attr handle
     * @attr helper
     * @attr revert
     * @attr scroll
     * @attr onDrag
     * @attr onStart
     * @attr onStop
     */
    def draggable = { attrs, body ->
        if (!attrs.selector) throwTagError("[selector] attribute must be specified to for <om:draggable>!")
        doTag('omDraggable', attrs, body)
    }

    /**
     * @attr selector
     *
     * @attr accept
     * @attr activeClass
     * @attr disabled
     * @attr greedy
     * @attr hoverClass
     * @attr onDragOut
     * @attr onDragOver
     * @attr onDragStart
     * @attr onDrop
     */
    def droppable = { attrs, body ->
        if (!attrs.selector) throwTagError("[selector] attribute must be specified to for <om:droppable>!")
        doTag('omDroppable', attrs, body)
    }

    /**
     * @attr selector
     *
     * @attr thick
     */
    def scrollbar = { attrs, body ->
        if (!attrs.selector) throwTagError("[selector] attribute must be specified to for <om:scrollbar>!")
        doTag('omScrollbar', attrs, body)
    }


}