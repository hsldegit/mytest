package com.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Authror huangshilu
 * @Date 2021/3/16 17:06
 */


public class 开根号 {

    public static void main(String[] args) {
        System.out.println(a(10000));
    }

    public static double a(int a) {
        double start = 0.0;
        double end = a;

        double x = (end - start) / 2.0;
        while (Math.abs(x * x - a) > 0.00000000000000000000000000001) {
            System.out.println(x);
            if (x * x > a) {
                end = x;
            } else {
                start = x;
            }
            x = (end - start) / 2.0 + start;
        }
        return x;
    }

}
