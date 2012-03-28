package org.grails.plugins.omui

import com.alibaba.fastjson.JSON
import com.alibaba.fastjson.serializer.JSONSerializerMap
import org.grails.plugins.omui.json.JSONContent
import org.grails.plugins.omui.json.JsDateFormatSerializer
import org.grails.plugins.omui.util.AttitudeTypeUtil

class AttitudeTypeService {

    static transactional = false

    private static JSONSerializerMap mapping = new JSONSerializerMap()

    static {
        mapping.put(Date.class, new JsDateFormatSerializer())
    }

    def omuiComponentService

    def attrsToConfig(String compName, Map attrs, Map remainAttributes) {
        return attrs.inject([:]) {Map map, Map.Entry<String, Object> entity ->
            Attitude attitude = omuiComponentService.getAttitude(compName, entity.key)
            if (attitude) {
                map.put(entity.key, AttitudeTypeUtil.transform(attitude.types, entity.value))
            } else if (omuiComponentService.hasEvent(compName, entity.key)) {
                map.put(entity.key, new JSONContent(entity.value?.toString()))
            } else {
                remainAttributes.put(entity.key, entity.value)
            }
            return map
        }
    }

    def configToJson(config) {
        return JSON.toJSONString(config, mapping)
    }
}
