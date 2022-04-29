package ru.m1kem1ke.cheapshark.api.wrapper.util;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class RequestUtils {

    public static Map<String, String> toQueryMap(Object request) throws IllegalAccessException {
        Map<String, String> parameters = new HashMap<>();

        for (Field field : request.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            String name = field.getName();
            Object value = field.get(request);

            if (value != null) {
                parameters.put(name, String.valueOf(value));
            }
        }

        return parameters;
    }
}
