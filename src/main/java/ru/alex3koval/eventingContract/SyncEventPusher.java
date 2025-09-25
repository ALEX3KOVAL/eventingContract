package ru.alex3koval.eventingContract;

@FunctionalInterface
public interface SyncEventPusher extends BaseEventPusher {
    void push(String topic, Event event) throws InterruptedException;
}
