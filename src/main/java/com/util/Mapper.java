package com.util;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Mapper {
    public static JsonNode mapToJson(Object object) {
        return new ObjectMapper().valueToTree(object);
    }
}
