package com.boot.jksonutil;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class JacksonUtil {

    public static final ObjectMapper mapper = new ObjectMapper();

    public static String getString(Object object) throws JsonProcessingException {
        return mapper.writeValueAsString(object);
    }

    public static <T> T getObject(String value, Class<T> t) throws IOException {
        return mapper.readValue(value, t);
    }
}
