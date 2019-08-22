package com.jimbolix.september.util;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import java.io.StringWriter;

/**
 * json序列化工具类
 */
public class JsonSerializationUtil {

    public static String toJsonString(Object o) throws Exception {
        ObjectMapper obj = new ObjectMapper();
        obj.setSerializationInclusion(JsonSerialize.Inclusion.NON_NULL);
        StringWriter sw = new StringWriter();
        obj.writeValue(sw, o);
        return sw.toString();
    }
}
