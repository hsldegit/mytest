package com.leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * <p>
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 * <p>
 * 示例:
 * <p>
 * 给定 nums = [2, 7, 11, 15], target = 9
 * <p>
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 *
 * @author huangshilu
 * @date 2019/5/5 14:44
 * @description
 */
public class LeetCode0001 {


    public static void main(String[] args) {

        int totalPage = 251;
        System.out.println(totalPage / 50);
        long offset = 0L;
        for (int i = 1; i <= totalPage / 50; i++) {
            int startPage = i * 50 + 1;
            if (startPage > totalPage) {
                break;
            }
            int endPage = (i + 1) * 50;
            if (endPage >= totalPage) {
                endPage = totalPage;
            }
            offset = aaa(startPage - 1);
            System.out.println("startPage=" + (startPage - (i * 50)) + ",endPage=" + (endPage - (i * 50)) + ",offset=" + offset);
        }
        //x * x = 5;
        //求x

        //System.out.println(Arrays.toString(twoSum(nums, 6)));
    }

    public static long aaa(int page) {
        System.out.println("getOffsetPage=" + page);
        return page * 100;
    }


    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map1 = new HashMap<>();
        for (int i = 0, size = nums.length; i < size; i++) {
            int diff = target - nums[i];
            if (map1.containsKey(diff) && map1.get(diff) != i) {
                result[0] = i;
                result[1] = map1.get(diff);
                return result;
            }
            map1.put(nums[i], i);
        }
        return null;
    }
}
