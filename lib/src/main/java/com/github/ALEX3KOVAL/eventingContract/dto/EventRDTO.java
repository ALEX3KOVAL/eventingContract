package com.github.ALEX3KOVAL.eventingContract.dto;

import com.github.ALEX3KOVAL.eventingContract.vo.EventStatus;

import java.time.LocalDateTime;

public record EventRDTO(
    String name,
    String topic,
    String json,
    EventStatus status,
    LocalDateTime createdAt
) {
}
