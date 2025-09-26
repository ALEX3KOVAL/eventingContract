package ru.alex3koval.eventingContract.dto;

import java.time.LocalDateTime;

public record UpdateEventWDTO(
    LocalDateTime updatedAt
) {
}
