package com.github.ALEX3KOVAL.eventingContract.vo;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;
import java.util.Optional;

@RequiredArgsConstructor
@Getter
public enum EventStatus {
    CREATED((short) 0),
    CONFIRMED((short) 1),
    DEAD((short) 2);

    private final short value;

    public boolean isCreated() {
        return equals(CREATED);
    }

    public static Optional<EventStatus> of(short value) {
        return Arrays
            .stream(EventStatus.values())
            .filter(status -> status.value == value)
            .findFirst();
    }
}
