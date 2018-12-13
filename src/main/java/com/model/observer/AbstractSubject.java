package com.model.observer;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @author huangshilu
 * @date 2018/12/13 10:40
 * @description
 */
public abstract class AbstractSubject implements Subject {

    private Vector<Observer> vectors = new Vector<>();

    @Override
    public void add(Observer observer) {
        vectors.add(observer);
    }

    @Override
    public void del(Observer observer) {
        vectors.remove(observer);
    }

    @Override
    public void notifyObserver() {
        Enumeration<Observer> elements = vectors.elements();
        while (elements.hasMoreElements()) {
            elements.nextElement().update();
        }
    }


}
