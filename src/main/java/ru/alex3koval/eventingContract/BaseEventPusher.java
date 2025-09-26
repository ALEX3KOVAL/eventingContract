package ru.alex3koval.eventingContract;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public interface BaseEventPusher {
    default String serializeToJson(ObjectMapper mapper, Object payload) throws JsonProcessingException {
        return payload instanceof String ? (String)payload : mapper.writeValueAsString(payload);
    }
}
