package com.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Authror huangshilu
 * @Date 2021/2/1 15:56
 */


public class l_0888糖果的公平交换 {

    public static void main(String[] args) {

        int[] A = {1, 2, 5};
        int[] B = {2, 4};
        int[] result = fairCandySwap(A, B);
        System.out.println(Arrays.toString(result));
    }


    public static int[] fairCandySwap(int[] A, int[] B) {
        int totalA = 0;
        for (int a : A) {
            totalA += a;
        }
        int totalB = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int b : B) {
            totalB += b;
            map.put(b, map.getOrDefault(b, 0) + 1);
        }
        int[] result = new int[2];
        int total = (totalA + totalB) / 2;
        System.out.println(total);
        int need = 0;
        for (int a : A) {
            need = total - (totalA - a);
            if (map.containsKey(need) && (total - (totalB - need) == a)) {
                result[0] = a;
                result[1] = need;
            }
        }
        return result;
    }
}
