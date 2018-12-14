package com.model.proxy.sta;

import static java.lang.System.out;

/**
 * @author huangshilu
 * @date 2018/12/14 15:04
 * @description
 */
public class HelloServiceImpl implements HelloService {

    @Override
    public String hello(String name) {
        out.println("name=" + name);
        return "Hello " + name;
    }

    @Override
    public String hi(String msg) {
        out.println("msg=" + msg);
        return "Hi, " + msg;
    }
}
