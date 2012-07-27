package org.grails.plugins.omui.json

import com.alibaba.fastjson.JSON
import com.alibaba.fastjson.JSONAware
import org.codehaus.groovy.grails.web.util.StreamCharBuffer

class Mixed implements JSONAware {
    def value

    Mixed(value) {
        this.value = value
    }

    String toJSONString() {
        if (value instanceof StreamCharBuffer) value = value.toString()
        if (value && value instanceof String) {
            String trimValue = value.trim()
            if (trimValue == 'true' || trimValue == 'false' || trimValue.isNumber() || trimValue.startsWith('function') ||
                    trimValue.startsWith('{') || trimValue.startsWith('[')) {
                value = new JSONContent(trimValue)
            }
        }
        return value ? JSON.toJSONString(value) : ''
    }
}
