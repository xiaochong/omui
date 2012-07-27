package org.grails.plugins.omui.json

import com.alibaba.fastjson.JSON
import com.alibaba.fastjson.JSONAware

class Mixed implements JSONAware {
    def value

    Mixed(value) {
        this.value = value
    }

    String toJSONString() {
        if (value && value instanceof String) {
            String trimValue = value.trim()
            if (trimValue == 'true' || trimValue == 'false' || trimValue.isNumber() || trimValue.startsWith('function') ||
                    trimValue.startsWith('{') || trimValue.startsWith('[')) {
                value = new JSONContent(trimValue)
            }
        }
        return JSON.toJSONString(value)
    }
}
