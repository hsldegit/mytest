package com.leetcode;

public class l_0413等差数列划分 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(numberOfArithmeticSlices(nums));
    }

    public static int numberOfArithmeticSlices(int[] nums) {
        int length = nums.length;
        if (length <= 2) {
            return 0;
        }
        int totalCount = 0;
        int count = 0;
        for (int i = 2; i < length; i++) {
            if (2 * nums[i - 1] == nums[i] + nums[i - 2]) {
                count = count + 1;
            } else {
                count = 0;
            }
            totalCount += count;
        }

        return totalCount;
    }
}
