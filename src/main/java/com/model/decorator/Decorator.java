package com.model.decorator;

import static java.lang.System.out;

/**
 * 装饰器模式、用来给对象增加一点新功能 要求被装饰对象和装饰对象都实现同一个接口
 *
 * @author huangshilu
 * @date 2018/12/12 14:48
 * @description
 */
public class Decorator implements Sourceable {

    private Source source;

    public Decorator(Source source) {
        this.source = source;
    }

    @Override
    public void method() {
        //这里新增一些功能
        out.println("before");
        source.method();
        out.println("after");
    }


}
