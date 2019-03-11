package com.demo.serviceload;

import java.util.ServiceLoader;

/**
 * @author huangshilu
 * @date 2019/3/11 14:43
 * @description
 */
public class Main1 {

    public static void main(String[] args) {

        ServiceLoader<IShout> shouts = ServiceLoader.load(IShout.class);
        for (IShout s : shouts) {
            s.shout();
        }



    }
}
