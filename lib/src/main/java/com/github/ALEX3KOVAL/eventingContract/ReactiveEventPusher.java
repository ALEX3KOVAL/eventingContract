package com.github.ALEX3KOVAL.eventingContract;

import reactor.core.publisher.Mono;

@FunctionalInterface
public interface ReactiveEventPusher<T> extends BaseEventPusher {
    <PAYLOAD> Mono<T> push(String topic, Event<PAYLOAD> event);
}
