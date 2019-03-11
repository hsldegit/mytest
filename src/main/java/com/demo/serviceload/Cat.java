package com.demo.serviceload;

/**
 * @author huangshilu
 * @date 2019/3/11 14:55
 * @description
 */
public class Cat implements IShout {

    @Override
    public void shout() {
        System.out.println("miao miao");
    }
}
