package org.grails.plugins.omui.json

import com.alibaba.fastjson.JSONAware

class Event implements JSONAware {

    String value

    Event(String value) {
        this.value = value
    }


    String toJSONString() {
        return value ?: ''
    }
}
