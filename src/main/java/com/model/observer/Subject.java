package com.model.observer;

/**
 * @author huangshilu
 * @date 2018/12/13 10:28
 * @description
 */
public interface Subject {

    void add(Observer observer);

    void del(Observer observer);

    void notifyObserver();

    void operation();
}
