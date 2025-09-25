package ru.alex3koval.eventingContract;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import ru.alex3koval.eventingContract.Event;

public interface BaseEventPusher {
    default <PAYLOAD> String serializeToJson(ObjectMapper mapper, Event<PAYLOAD> event) throws JsonProcessingException {
        return mapper.writeValueAsString(event);
    }
}
