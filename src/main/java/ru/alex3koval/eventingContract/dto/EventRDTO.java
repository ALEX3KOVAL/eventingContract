package ru.alex3koval.eventingContract.dto;

import ru.alex3koval.eventingContract.vo.EventStatus;

import java.time.LocalDateTime;

public record EventRDTO(
    String name,
    String topic,
    String json,
    EventStatus status,
    LocalDateTime createdAt
) {
}
