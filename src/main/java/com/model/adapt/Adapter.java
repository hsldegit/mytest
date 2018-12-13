package com.model.adapt;

import static java.lang.System.out;

/**
 * 类的适配器模式
 *
 * @author huangshilu
 * @date 2018/12/12 13:58
 * @description
 */
public class Adapter extends Source implements Targetable {

    @Override
    public void method2() {
        out.println("this is the  targetable method");
    }
}
