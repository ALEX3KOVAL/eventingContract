package ru.alex3koval.eventingContract.dto;

import ru.alex3koval.eventingContract.vo.EventStatus;

public record CreateEventWDTO(
    String name,
    String topic,
    String json,
    EventStatus status
) {
}
