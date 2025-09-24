package ru.alex3koval.eventingContract;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public interface BaseEventPusher {
    default <PAYLOAD> String serializeToJson(ObjectMapper mapper, Event<PAYLOAD> event) throws JsonProcessingException {
        return mapper.writeValueAsString(event);
    }
}
