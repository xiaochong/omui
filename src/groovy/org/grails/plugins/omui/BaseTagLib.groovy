package org.grails.plugins.omui

import com.alibaba.fastjson.JSON

abstract class BaseTagLib {
    OmuiComponentService omuiComponentService

    protected doTag(Map attrs, Closure body, String compName, String containerTag = 'div') {
        def id = attrs.remove('id')
        def config = JSON.toJSONString(attrs.inject([:]) {Map map, Map.Entry<String, Object> entity ->
            Attitude attitude = omuiComponentService.getAttitude(compName, entity.key)
            if (attitude) {
                map.put(entity.key, transform(attitude.types, entity.value))
            }
            return map
        })
        out <<
                """
<${containerTag} id="${id}">
${body()}
</${containerTag}>
<script type=\"text/javascript\">
    \$(function () {
        \$('#${id}').om${compName.capitalize()}(${config});
    });
</script>
"""
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
        }
        return false
    }

    private Object transformAttitudeType(AttitudeType type, String value) {
        switch (type) {
            case AttitudeType.Boolean:
                return Boolean.valueOf(value)
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
