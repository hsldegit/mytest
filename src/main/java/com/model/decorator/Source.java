package com.model.decorator;

import static java.lang.System.out;

/**
 * @author huangshilu
 * @date 2018/12/12 14:47
 * @description
 */
public class Source implements Sourceable{

    @Override
    public void method() {
        out.println("this is original method");
    }




}
