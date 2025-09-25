package ru.alex3koval.eventingContract;

public interface EventListener<T, R> {
    R onEvent(T event);
}
