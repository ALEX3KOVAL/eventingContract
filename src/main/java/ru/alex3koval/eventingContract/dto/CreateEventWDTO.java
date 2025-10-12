package ru.alex3koval.eventingContract.dto;

import ru.alex3koval.eventingContract.vo.EventStatus;

import java.time.LocalDateTime;
import java.util.Map;

public record CreateEventWDTO(
    String name,
    String topic,
    Map<String, Object> model,
    EventStatus status,
    LocalDateTime createdAt
) {
}
