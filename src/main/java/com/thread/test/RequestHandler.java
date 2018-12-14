package com.thread.test;

public interface RequestHandler<T> {
    void handle(T result);
}
