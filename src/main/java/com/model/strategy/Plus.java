package com.model.strategy;

/**
 * @author huangshilu
 * @date 2018/12/13 10:11
 * @description
 */
public class Plus extends AbstractCalculator implements ICalculator {

    @Override
    public int calculator(String exp) {
        int[] arrInt = split(exp, "\\+");
        return arrInt[0] + arrInt[1];
    }
}
