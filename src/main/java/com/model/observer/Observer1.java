package com.model.observer;

import static java.lang.System.out;

/**
 * @author huangshilu
 * @date 2018/12/13 10:27
 * @description
 */
public class Observer1 implements Observer{

    @Override
    public void update() {
        out.println("observer1 has received");
    }

}
