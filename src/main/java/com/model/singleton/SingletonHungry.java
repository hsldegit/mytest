package com.model.singleton;

/**
 * 单例模式-饿汉模式
 *
 * @author huangshilu
 * @date 2018/12/12 10:38
 * @description
 */
public class SingletonHungry {

    public static SingletonHungry singletonHungry = new SingletonHungry();

    private SingletonHungry() {

    }

    public static SingletonHungry getInstance() {
        return singletonHungry;
    }


}
