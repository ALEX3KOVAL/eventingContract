package ru.alex3koval.eventingContract;

import ru.alex3koval.eventingContract.vo.EventStatus;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class Event<T> {
    private final String name;
    private final T payload;
    private final EventStatus status;
    private final LocalDateTime createdAt;

    public Event(
        T payload,
        EventStatus status
    ) {
        this.name = payload.getClass().getCanonicalName();
        this.payload = payload;
        this.status = status;
        this.createdAt = LocalDateTime.now();
    }

    public Event(
        String name,
        T payload,
        EventStatus status
    ) {
        this.name = name;
        this.payload = payload;
        this.status = status;
        this.createdAt = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return String.format(
            "name = %s, payload = %s, status = %s, createdAt = %s",
            name,
            payload,
            status,
            createdAt
        );
    }
}
