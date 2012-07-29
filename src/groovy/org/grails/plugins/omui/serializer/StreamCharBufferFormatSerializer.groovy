package org.grails.plugins.omui.serializer

import com.alibaba.fastjson.serializer.JSONSerializer
import com.alibaba.fastjson.serializer.ObjectSerializer
import com.alibaba.fastjson.serializer.SerializeWriter

import java.lang.reflect.Type

class StreamCharBufferFormatSerializer implements ObjectSerializer {
    void write(JSONSerializer serializer, Object object, Object fieldName, Type fieldType) {
        SerializeWriter out = serializer.getWriter()
        if (object == null) {
            out.writeNull()
            return
        }
        out.writeString(object.toString())
    }
}
