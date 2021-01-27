package com.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Authror huangshilu
 * @Date 2021/1/26 11:21
 */


public class l_0046全排列 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(permute(arr));
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();
        xxx(nums, resultList, 0, new ArrayList<>());
        return resultList;
    }

    public static void xxx(int[] nums, List<List<Integer>> resultList, int index, List<Integer> item) {
        if (index == nums.length) {
            resultList.add(new ArrayList<>(item));
            return;
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (item.contains(nums[i])){
                    continue;
                }
                item.add(nums[i]);
                xxx(nums, resultList, index + 1, item);
                item.remove(index);
            }
        }
    }


}
