package com.leetcode;

import java.util.Map;

/**
 * @Authror huangshilu
 * @Date 2020/12/23 18:12
 */


public class l_0055跳跃游戏 {

    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 0, 4};
        int[] arr1 = {2, 3, 1, 1, 4};
        int[] arr2 = {3, 0, 8, 2, 0, 0, 1};
        int[] arr4 = {4, 2, 0, 0, 1, 1, 4, 4, 4, 0, 4, 0};
        System.out.println(canJump(arr4));

    }

    public static boolean canJump(int[] nums) {
        int length = nums.length;
        int i = 0;
        while (i < length) {
            if (i + nums[i] >= length - 1) {
                return true;
            }
            if (nums[i] == 0) {
                int j = i - 1;
                while (j + nums[j] <= i) {
                    if (j == 0) {
                        return false;
                    }
                    j--;
                }
            }
            i++;
        }
        return true;
    }


}
