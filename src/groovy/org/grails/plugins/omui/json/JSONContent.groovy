package org.grails.plugins.omui.json

import com.alibaba.fastjson.JSONAware

class JSONContent implements JSONAware {

    String value

    JSONContent(String value) {
        this.value = value
    }


    String toJSONString() {
        return value ?: ''
    }
}