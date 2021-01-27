package com.leetcode;

import java.util.Arrays;
import java.util.List;

/**
 * @Authror huangshilu
 * @Date 2021/1/8 15:20
 */


public class l_0189旋转数组 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        rotate2(nums, 3);
        System.out.println(Arrays.toString(nums));
    }

    public static void rotate2(int[] nums, int k) {
        int length = nums.length;
        if (k > length) {
            k = k % length;
        }
        rever(nums, 0, length - 1);
        rever(nums, 0, k - 1);
        rever(nums, k, length - 1);
    }

    public static void rever(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }


    public static void rotate(int[] nums, int k) {
        int[] temp = nums.clone();
        if (k > nums.length) {
            k = k % nums.length;
        }
        int a = nums.length - k;//4
        int c = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i < k) {
                nums[i] = temp[a];
                a++;
            } else {
                // 3456
                nums[i] = temp[c];
                c++;
            }
        }
    }
}
