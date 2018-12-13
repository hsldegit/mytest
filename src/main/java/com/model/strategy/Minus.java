package com.model.strategy;

/**
 * @author huangshilu
 * @date 2018/12/13 10:08
 * @description
 */
public class Minus extends AbstractCalculator implements ICalculator {

    @Override
    public int calculator(String exp) {
        int[] arrayInt = split(exp, "-");
        return arrayInt[0] - arrayInt[1];
    }
}
