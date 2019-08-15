package com.model.singleton;

/**
 * 单例模式-懒汉模式
 *
 * @author huangshilu
 * @date 2018/12/12 10:40
 * @description
 */
public class SingletonLazy {

    private volatile static SingletonLazy singletonLazy = null;

    private SingletonLazy() {

    }
    public static SingletonLazy getInstance() {
        if (singletonLazy == null) {
            synchronized (SingletonLazy.class) {
                //这里在判断一次null 防止排队线程拿到锁后又直接new对象 第一个进来的线程new完对象释放锁 排队线程进来直接返回
                if (singletonLazy == null) {
                    singletonLazy = new SingletonLazy();
                }
            }
        }
        return singletonLazy;
    }


}
