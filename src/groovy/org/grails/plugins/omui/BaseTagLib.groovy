package org.grails.plugins.omui

import com.alibaba.fastjson.JSON
import com.alibaba.fastjson.serializer.JSONSerializerMap
import org.grails.plugins.omui.json.JSONContent
import org.grails.plugins.omui.json.JsDateFormatSerializer

abstract class BaseTagLib {

    private static JSONSerializerMap mapping = new JSONSerializerMap()

    static {
        mapping.put(Date.class, new JsDateFormatSerializer())
    }

    OmuiComponentService omuiComponentService

    protected doTag(Map attrs, Closure body, String compName, String containerTag = 'div') {
        def id = attrs.remove('id') ?: UUID.randomUUID().toString()
        def outputAttributes = [:]
        def config = JSON.toJSONString(attrs.inject([:]) {Map map, Map.Entry<String, Object> entity ->
            Attitude attitude = omuiComponentService.getAttitude(compName, entity.key)
            if (attitude) {
                map.put(entity.key, transform(attitude.types, entity.value))
            } else {
                outputAttributes.put(entity.key, entity.value)
            }
            return map
        }, mapping)
        def outputAttributeContent = outputAttributes.collect {k, v ->
            "$k=\"${v?.encodeAsHTML()}\""
        }.join(' ')
        out <<
                """<${containerTag} id="${id}" ${outputAttributeContent}>${body()}</${containerTag}>"""
        r.script {
            return "jQuery(function(){jQuery('#${id}').om${compName.capitalize()}(${config});});\n"
        }
    }

    private Object transform(List<AttitudeType> types, Object value) {
        if (value instanceof String) {
            for (AttitudeType type in types) {
                if (isAttitudeType(type, value)) {
                    return transformAttitudeType(type, value)
                }
            }
        }
        return value
    }

    private Boolean isAttitudeType(AttitudeType type, String value) {
        switch (type) {
            case AttitudeType.Boolean:
                if (value == 'true' || value == 'false') {
                    return true
                }
                break
            case AttitudeType.Number:
                if (value.isNumber()) {
                    return true
                }
                break
            case AttitudeType.Function:
                if (value && value.trim().startsWith('function')) {
                    return true
                }
                break
        }
        return false
    }

    private Object transformAttitudeType(AttitudeType type, String value) {
        switch (type) {
            case AttitudeType.Boolean:
                return Boolean.valueOf(value)
                break
            case AttitudeType.Function:
                return new JSONContent(value)
                break
            case AttitudeType.Number:
                if (value.isInteger()) return value.toInteger()
                if (value.isLong()) return value.toLong()
                if (value.isDouble()) return value.toDouble()
                if (value.isFloat()) return value.toFloat()
                break
        }
        return value
    }
}
