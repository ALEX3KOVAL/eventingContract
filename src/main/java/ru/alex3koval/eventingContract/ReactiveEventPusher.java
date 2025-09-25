package ru.alex3koval.eventingContract;

import reactor.core.publisher.Mono;
import ru.alex3koval.eventingContract.vo.EventStatus;

public interface ReactiveEventPusher<T> extends BaseEventPusher {
    Mono<T> push(String topic, EventStatus status, Object payload);
    Mono<T> push(String topic, EventStatus status, Object payload, String eventName);
}
