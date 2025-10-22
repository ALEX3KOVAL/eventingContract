package ru.alex3koval.eventingContract.dto;

import ru.alex3koval.eventingContract.vo.EventStatus;

import java.time.LocalDateTime;

public record UpdateEventWDTO(
    EventStatus status,
    LocalDateTime updatedAt
) {
}
