package com.model.observer;

/**
 * 观察者模式-
 *
 * @author huangshilu
 * @date 2018/12/13 10:51
 * @description
 */
public class ObserverTest {

    public static void main(String[] args) {
        Subject subject = new MySubject();
        Observer observer1 = new Observer1();
        Observer observer2 = new Observer2();
        subject.add(observer1);
        subject.add(observer2);
        subject.operation();
    }

}
