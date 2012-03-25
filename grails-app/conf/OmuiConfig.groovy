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

    button {
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

}