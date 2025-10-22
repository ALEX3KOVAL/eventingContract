package ru.alex3koval.eventingContract;

import ru.alex3koval.eventingContract.vo.EventStatus;

public interface SyncEventPusher extends BaseEventPusher {
    void push(
        String id,
        String topic,
        EventStatus status,
        Object payload
    );
    void push(
        String id,
        String topic,
        EventStatus status,
        Object payload,
        String eventName
    );

    void push(
        String topic,
        EventStatus status,
        Object payload
    );
    void push(
        String topic,
        EventStatus status,
        Object payload,
        String eventName
    );
}
