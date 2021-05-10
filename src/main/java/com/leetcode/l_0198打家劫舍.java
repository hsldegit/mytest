package com.leetcode;

/**
 * @author huangshilu
 * @date 2021/5/7 20:07
 */
public class l_0198打家劫舍 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1};
        System.out.println(rob(arr));
    }

    //[1,2,3,1]
    //dp[i] =max(nums[i] + dp[i-2],dp[i-1])
    //dp[0] = nums[0]
    //dp[1] = max(nums[0],nums[1])
    public static int rob(int[] nums) {
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
