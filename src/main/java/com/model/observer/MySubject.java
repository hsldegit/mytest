package com.model.observer;

import static java.lang.System.out;

/**
 * @author huangshilu
 * @date 2018/12/13 10:47
 * @description
 */
public class MySubject extends AbstractSubject {

    @Override
    public void operation() {
        out.println("update self");
        notifyObserver();
    }




}
