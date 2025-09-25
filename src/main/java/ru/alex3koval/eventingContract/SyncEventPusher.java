package ru.alex3koval.eventingContract;

import ru.alex3koval.eventingContract.BaseEventPusher;
import ru.alex3koval.eventingContract.Event;

@FunctionalInterface
public interface SyncEventPusher extends BaseEventPusher {
    <PAYLOAD> void push(String topic, Event<PAYLOAD> event) throws InterruptedException;
}
