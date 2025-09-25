package ru.alex3koval.eventingContract;

import ru.alex3koval.eventingContract.vo.EventStatus;

@FunctionalInterface
public interface SyncEventPusher extends BaseEventPusher {
    void push(String topic, EventStatus status, Object payload) throws InterruptedException;
}
