package com.github.ALEX3KOVAL.eventingContract;

@FunctionalInterface
public interface SyncEventPusher extends BaseEventPusher {
    <PAYLOAD> void push(String topic, Event<PAYLOAD> event) throws InterruptedException;
}
