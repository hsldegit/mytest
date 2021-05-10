package com.leetcode;

import java.util.Arrays;

/**
 * @author huangshilu
 * @date 2021/4/19 19:26
 */
public class l_0027移除元素 {

    public static void main(String[] args) {

        System.out.println(System.currentTimeMillis());

        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
//        System.out.println(removeElement(nums, 2));
//        System.out.println(Arrays.toString(nums));
        int totalCount = 105;
        int pageSize = 20;
        int totalPage = (totalCount + pageSize - 1) / pageSize;
        System.out.println(totalPage);
    }


    public static int removeElement(int[] nums, int val) {
        int total = nums.length;
        int cur = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                total--;
            } else {
                nums[cur++] = nums[i];
            }
        }
        return total;
    }
}
