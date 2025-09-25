package ru.alex3koval.eventingContract;

import reactor.core.publisher.Mono;

@FunctionalInterface
public interface ReactiveEventPusher<T> extends BaseEventPusher {
    <R> Mono<T> push(String topic, Event event, Class<R> payloadClazz);
}
