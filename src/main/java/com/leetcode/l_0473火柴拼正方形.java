package com.leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author huangshilu
 * @date 2021/5/8 15:11
 */
public class l_0473火柴拼正方形 {

    public static void main(String[] args) {
        int[] arr = {5, 5, 5, 5, 4, 4, 4, 4, 3, 3, 3, 3};
        System.out.println(makesquare(arr));
    }

    public static boolean makesquare(int[] nums) {
        if (nums.length < 4) {
            return false;
        }
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if (sum % 4 != 0) {
            return false;
        }
        Arrays.sort(nums);
        return allocate(nums, nums.length - 1, new int[4], sum / 4);
    }

    private static boolean allocate(int[] nums, int pos, int[] sums, int avg) {
        if (pos == -1) {
            return sums[0] == avg && sums[1] == avg && sums[2] == avg;
        }
        for (int i = 0; i < 4; ++i) {
            if (sums[i] + nums[pos] > avg) {
                continue;
            }
            sums[i] += nums[pos];
            if (allocate(nums, pos - 1, sums, avg)) {
                return true;
            }
            sums[i] -= nums[pos];
        }
        return false;
    }

}
