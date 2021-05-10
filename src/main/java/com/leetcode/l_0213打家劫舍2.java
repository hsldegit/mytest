package com.leetcode;

import java.util.Arrays;
import java.util.List;

/**
 * @author huangshilu
 * @date 2021/4/16 14:13
 */
public class l_0213打家劫舍2 {

    public static void main(String[] args) {

        int[] nums1 = {2, 3, 2};
        int[] nums2 = {1, 2, 3, 1};
        int[] nums3 = {6, 6, 4, 8, 4, 3, 3, 10};
        //             0  1  2  3  4  5  6  7
        //System.out.println(rob(nums3));
    }

    //dp[i] =max(nums[i] + dp[i-2],dp[i-1])
    //dp[start] = nums[start]
    //dp[start+1] = max(nums[start],nums[start+1])
    public static int rob(Integer[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        int length = nums.length;


        return Math.max(1,2);
    }

    public static int rob1(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        int dp_1 = Math.max(nums[0], nums[1]);
        int dp_2 = nums[0];
        int dp = 0;
        for (int i = 2; i < nums.length; i++) {
            dp = Math.max(nums[i] + dp_2, dp_1);
            dp_2 = dp_1;
            dp_1 = dp;
        }
        return dp;
    }


}
