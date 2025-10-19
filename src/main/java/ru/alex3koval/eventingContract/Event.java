package ru.alex3koval.eventingContract;

import ru.alex3koval.eventingContract.vo.EventStatus;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class Event {
    private final String name;
    private final String json;
    private final EventStatus status;
    private final LocalDateTime createdAt;

    public Event(
        String name,
        String json,
        EventStatus status
    ) {
        this.name = name;
        this.json = json;
        this.status = status;
        this.createdAt = LocalDateTime.now();
    }

    public Event(
        String name,
        String json,
        EventStatus status,
        LocalDateTime createdAt
    ) {
        this.name = name;
        this.json = json;
        this.status = status;
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return String.format(
            "name = %s, json = %s, status = %s, createdAt = %s",
            name,
            json,
            status,
            createdAt
        );
    }
}
