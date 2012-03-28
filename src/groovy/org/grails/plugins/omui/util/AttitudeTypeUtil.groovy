package org.grails.plugins.omui.util

import org.grails.plugins.omui.AttitudeType
import org.grails.plugins.omui.json.JSONContent
import org.codehaus.groovy.grails.web.util.StreamCharBuffer

class AttitudeTypeUtil {
    static Object transform(List<AttitudeType> types, Object value) {
        if (value instanceof StreamCharBuffer) value = value.toString()
        if (value instanceof String) {
            for (AttitudeType type in types) {
                if (isAttitudeType(type, value)) {
                    return transformAttitudeType(type, value)
                }
            }
        }
        return value
    }

    private static Boolean isAttitudeType(AttitudeType type, String value) {
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
            case AttitudeType.Array:
                if (value && value.trim().startsWith('[')) {
                    return true
                }
                break
            case AttitudeType.JSON:
            case AttitudeType.Object:
                if (value && value.trim().startsWith('{')) {
                    return true
                }
                break
        }
        return false
    }

    private static Object transformAttitudeType(AttitudeType type, String value) {
        switch (type) {
            case AttitudeType.Boolean:
                return Boolean.valueOf(value)
                break
            case AttitudeType.Function:
                return new JSONContent(value)
                break
            case AttitudeType.JSON:
            case AttitudeType.Object:
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
