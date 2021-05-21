package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author huangshilu
 * @date 2021/5/11 16:31
 */
public class l_0015三数之和 {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(Arrays.toString(nums));
        System.out.println(threeSum(nums));
    }

    //a+b+c = 0
    public static List<List<Integer>> threeSum(int[] nums) {
        int length = nums.length;
        if (length < 3) {
            return new ArrayList<>();
        }
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        //a +b +c =0;
        for (int i = 0; i <= length - 3; i++) {
            int target = 0 - nums[i];
            int start = i + 1;
            int end = length - 1;
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            while (start < end) {
                if (nums[start] + nums[end] == target) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[start]);
                    list.add(nums[end]);
                    result.add(list);
                    while (start < end && nums[start + 1] == nums[start]) {
                        start++;
                    }
                    while (start < end && nums[end] == nums[end - 1]) {
                        end--;
                    }
                    start++;
                    end--;
                } else if (nums[start] + nums[end] < target) {
                    start++;
                } else {
                    end--;
                }
            }
        }
        return result;
    }
}
