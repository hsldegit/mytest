package com.leetcode;

import java.util.Arrays;

/**
 * @Authror huangshilu
 * @Date 2020/12/30 16:01
 */


public class l_1046最后一块石头重量 {

    public static void main(String[] args) {
        int[] arr = {2, 7, 4, 1, 8, 1};
        System.out.println(lastStoneWeight(arr));
    }

    public static int lastStoneWeight(int[] stones) {
        int lastIndex = stones.length - 1;
        if (lastIndex == 0) {
            return stones[lastIndex];
        }
        Arrays.sort(stones);
        while (stones[lastIndex - 1] > 0) {
            stones[lastIndex] = stones[lastIndex] - stones[lastIndex - 1];
            stones[lastIndex - 1] = 0;
            Arrays.sort(stones);
        }
        return stones[lastIndex];
    }
}
