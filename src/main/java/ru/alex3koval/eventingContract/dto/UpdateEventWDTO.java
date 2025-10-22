package ru.alex3koval.eventingContract.dto;

import ru.alex3koval.eventingContract.vo.EventStatus;

public record UpdateEventWDTO(
    EventStatus status
) {
}
