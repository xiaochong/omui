//def String, Object, Number, Boolean, Selector, Function, Date, Array, URL

components {

    tabs {
        attitudes {
            active = 'Number,String'
            autoPlay = 'Boolean'
            border = 'Boolean'
            closable = 'Boolean,Array'
            height = 'Number,String'
            interval = 'Number'
            lazyLoad = 'Boolean'
            scrollable = 'Boolean'
            switchMode = 'String'
            tabHeight = 'Number,String'
            tabWidth = 'Number,String'
            width = 'Number,String'
        }
        events = ['onActivate', 'onAdd', 'onBeforeActivate', 'onBeforeAdd', 'onBeforeClose',
                'onBeforeCloseAll', 'onClose', 'onCloseAll', 'onLoadComplete']
    }

    accordion {
        attitudes {
            active = "Number,String"
            autoPlay = "Boolean"
            collapsible = "Boolean"
            disabled = "Boolean"
            height = "Number,String"
            iconCls = "String"
            interval = "Number"
            switchEffect = "Boolean"
            switchMode = "String"
            width = "Number,String"
        }
        events = ['onActivate', 'onBeforeActivate', 'onBeforeCollapse', 'onCollapse']
    }

    dialog {
        attitudes {
            autoOpen = "Boolean"
            buttons = "Array"
            closeOnEscape = "Boolean"
            dialogClass = "String"
            draggable = "Boolean"
            height = "Number"
            maxHeight = "Number"
            maxWidth = "Number"
            minHeight = "Number"
            minWidth = "Number"
            modal = "Boolean"
            resizable = "Boolean"
            title = "String"
            width = "Number"
        }
        events = ['onBeforeClose', 'onClose', 'onOpen']
    }

    calendar {
        attitudes {
            date = 'Date'
            dateFormat = 'String'
            disabled = 'Boolean'
            disabledDays = 'Array'
            disabledFn = 'Function'
            editable = 'Boolean'
            maxDate = 'Date'
            minDate = 'Date'
            pages = 'Number'
            popup = 'Boolean'
            readOnly = 'Boolean'
            showTime = 'Boolean'
            startDay = 'Number'
        }
        events = ['onSelect']
        containerTag = 'input'
    }

    combo {
        attitudes {
            autoFilter = 'Boolean'
            dataSource = 'Array,URL'
            disabled = 'Boolean'
            editable = 'Boolean'
            emptyText = 'String'
            filterDelay = 'Number'
            filterStrategy = 'String,Function'
            inputField = 'String,Function'
            lazyLoad = 'Boolean'
            listAutoWidth = 'Boolean'
            listMaxHeight = 'Number'
            listProvider = 'Function'
            multi = 'Boolean'
            multiSeparator = 'String'
            optionField = 'String,Function'
            readOnly = 'Boolean'
            value = 'String'
            valueField = 'String,Function'
            width = 'String'
        }
        events = ['onError', 'onSuccess', 'onValueChange']
        containerTag = 'input'
    }

    numberField {
        attitudes {
            allowDecimals = 'Boolean'
            allowNegative = 'Boolean'
            decimalPrecision = 'Number'
            disabled = 'Boolean'
            readOnly = 'Boolean'
        }
        events = ['onBlur']
        containerTag = 'input'
    }

    editor {
        attitudes {
            allowImageType = 'Array'
            basicEntities = 'Boolean'
            blockedBrowserKeystrokes = 'Array'
            docType = 'String'
            enableTabKeyTools = 'Boolean'
            enterMode = 'Number'
            filebrowserImageUploadUrl = 'String'
            height = 'Number'
            keystrokes = 'Array'
            readOnly = 'Boolean'
            resizable = 'Boolean'
            skin = 'String'
            startupFocus = 'Boolean'
            startupMode = 'String'
            toolbar = 'Array,String'
            uiColor = 'String'
            undoStackSize = 'Number'
            width = 'Number,String'
        }
        events = ['onKeyUp']
        containerTag = 'textarea'
    }

    suggestion {
        attitudes {
            cacheSize = 'Number'
            clientFormatter = 'Function'
            crossDomain = 'Boolean'
            dataSource = 'URL'
            delay = 'Number'
            disabled = 'Boolean'
            listMaxHeight = 'Number'
            listWidth = 'Number'
            method = 'String'
            minChars = 'Number'
            preProcess = 'Function'
            queryName = 'String'
            readOnly = 'Boolean'
        }
        events = ['onBeforeSuggest', 'onError', 'onSelect', 'onSuccess', 'onSuggesting']
        containerTag = 'input'
    }

    itemSelector {
        attitudes {
            autoSort = 'Boolean'
            availableTitle = 'String'
            clientFormatter = 'Function'
            dataSource = 'Array,URL'
            height = 'String'
            preProcess = 'Function'
            selectedTitle = 'String'
            toolbarIcons = 'Array'
            value = 'Array'
            width = 'String'
        }
        events = ['onBeforeItemDeselect', 'onBeforeItemSelect', 'onError', 'onItemDeselect',
                'onItemSelect', 'onSort', 'onSuccess']
    }

    panel {
        attitudes {
            closable = 'Boolean'
            closable = 'Boolean'
            collapsed = 'Boolean'
            collapsible = 'Boolean'
            header = 'Boolean'
            height = 'Number,String'
            iconCls = 'String'
            loadingMessage = 'String'
            preProcess = 'Function'
            title = 'String'
            tools = 'Array,Selector'
            url = 'String'
            width = 'Number,String'
        }
        events = ['onBeforeClose', 'onBeforeCollapse', 'onBeforeExpand', 'onBeforeOpen', 'onClose', 'onCollapse',
                'onError', 'onExpand', 'onOpen', 'onSuccess']
    }

    grid {
        attitudes {
            autoFit = 'Boolean'
            colModel = 'Array'
            dataSource = 'String'
            emptyMsg = 'String'
            errorMsg = 'String'
            extraData = 'JSON'
            height = 'Number'
            limit = 'Number'
            loadingMsg = 'String'
            method = 'String'
            pageStat = 'String'
            pageText = 'String'
            preProcess = 'Function'
            rowClasses = 'Array,Function'
            showIndex = 'Boolean'
            singleSelect = 'Boolean'
            title = 'String'
            width = 'Number'
        }
        events = ['onError', 'onPageChange', 'onRefresh', 'onRowClick', 'onRowDblClick', 'onRowDeselect',
                'onRowSelect', 'onSuccess'
        ]
        containerTag = 'table'
    }

    tree {
        attitudes {
            cascadeCheck = 'Boolean'
            dataSource = 'Array,String'
            draggable = 'Boolean'
            showCheckbox = 'Boolean'
            showIcon = 'Boolean'
            simpleDataModel = 'Boolean'
        }
        events = ['onBeforeCollapse', 'onBeforeExpand', 'onBeforeLoad', 'onBeforeSelect', 'onCheck',
                'onClick', 'onCollapse', 'onDblClick', 'onDrag', 'onDrop', 'onError', 'onExpand', 'onRightClick',
                'onSelect', 'onSuccess']
        containerTag = 'ul'
    }

    slider {
        attitudes {
            activeNavCls = 'String'
            animSpeed = 'String'
            autoPlay = 'Boolean'
            controlNav = 'Boolean,String,Selector'
            delay = 'Number'
            directionNav = 'Boolean'
            effect = 'String,Boolean'
            interval = 'Number'
            pauseOnHover = 'Boolean'
            startSlide = 'Number'
        }
        events = ['onAfterSlide', 'onBeforeSlide']
    }

    menu {
        attitudes {
            contextMenu = 'Boolean'
            dataSource = 'String'
            maxWidth = 'Number'
            minWidth = 'Number'
        }
        events = ['onSelect']
    }

    progressbar {
        attitudes {
            text = 'String,Function'
            value = 'Number'
            width = 'Number,String'
        }
        events = ['onChange']
    }

    button {
        attitudes {
            disabled = 'String'
            icons = 'Object'
            label = 'String'
            width = 'Number'
        }
        events = ['onClick']
        noGen = true
    }

}