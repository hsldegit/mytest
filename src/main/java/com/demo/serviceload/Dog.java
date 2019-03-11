package com.demo.serviceload;

/**
 * @author huangshilu
 * @date 2019/3/11 14:56
 * @description
 */
public class Dog implements IShout {

    @Override
    public void shout() {
        System.out.println("wang wang");
    }

}
