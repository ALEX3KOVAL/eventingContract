package com.github.ALEX3KOVAL.eventingContract;

@FunctionalInterface
public interface SyncEventPusher extends BaseEventPusher {
    void push(String topic, Event event) throws InterruptedException;
}
