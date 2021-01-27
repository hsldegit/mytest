package com.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Authror huangshilu
 * @Date 2021/1/14 16:02
 */


public class l_1018可被5整除的二进制前缀 {

    public static void main(String[] args) {
        int[] A = {0, 1, 1, 1, 1, 1};
        System.out.println(prefixesDivBy5(A));

    }

    public static List<Boolean> prefixesDivBy5(int[] A) {
        //101
        //
        //0101
        //1010
        //1111
        //10100
        //11001
        List<Boolean> list = new ArrayList<>(A.length);
        String regex = "";

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < A.length; i++) {
            result.append(A[i]);
            list.add(result.toString().matches(regex));
        }
        return list;
    }
}
