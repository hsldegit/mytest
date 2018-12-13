package com.model.strategy;

/**
 * @author huangshilu
 * @date 2018/12/13 10:04
 * @description
 */
abstract class AbstractCalculator {

    public int[] split(String exp, String opt) {
        String[] array = exp.split(opt);
        int[] arrInt = new int[2];
        arrInt[0] = Integer.parseInt(array[0]);
        arrInt[1] = Integer.parseInt(array[1]);
        return arrInt;
    }


}
