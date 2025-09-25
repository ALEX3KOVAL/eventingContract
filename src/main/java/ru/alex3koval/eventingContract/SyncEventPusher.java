package ru.alex3koval.eventingContract;

@FunctionalInterface
public interface SyncEventPusher extends BaseEventPusher {
    <T> void push(String topic, Event event, Class<T> paylaodClazz) throws InterruptedException;
}
