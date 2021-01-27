package com.leetcode;

import java.util.Arrays;

/**
 * @Authror huangshilu
 * @Date 2021/1/20 15:51
 */


public class l_0628三个数的最大乘积 {

    public static void main(String[] args) {
        int[] arr = {-1, -2, 1, 2, 3};
        System.out.println(maximumProduct(arr));
    }


    public static int maximumProduct(int[] nums) {
        int length = nums.length;
        if (length == 3) {
            return nums[0] * nums[1] * nums[2];
        }
        Arrays.sort(nums);
        int fu = 0;
        int zheng = 0;
        for (int i = 0; i < length; i++) {
            if (nums[i] < 0) {
                fu++;
            } else if (nums[i] > 0) {
                zheng++;
            }
        }
        if (zheng == 0) {
            return nums[length - 1] * nums[length - 2] * nums[length - 3];
        }
        if (fu >= 2) {
            int a = nums[length - 1] * nums[length - 2] * nums[length - 3];
            int b = nums[length - 1] * nums[0] * nums[1];
            return Math.max(a, b);
        }
        return nums[length - 1] * nums[length - 2] * nums[length - 3];
    }
}
