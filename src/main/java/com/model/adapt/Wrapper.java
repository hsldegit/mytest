package com.model.adapt;

/**
 * 对象的适配器模式 持有source对象 解决兼容性问题
 * @author huangshilu
 * @date 2018/12/12 14:07
 * @description
 */
public class Wrapper implements Targetable{

    private Source source;

    public Wrapper(Source source) {
        this.source = source;
    }

    @Override
    public void method1() {
        source.method1();
    }

    @Override
    public void method2() {
        System.out.println("this is the  targetable method");
    }


}
