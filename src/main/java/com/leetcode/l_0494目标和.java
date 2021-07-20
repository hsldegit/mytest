package com.leetcode;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

/**
 * @author huangshilu
 * @date 2021/6/7 19:44
 */
public class l_0494目标和 {
    public static void main(String[] args) {
        JSONObject parse = JSONObject.parseObject("{\"permission\": [\"170\"]}");
        JSONArray permission = parse.getJSONArray("permission");
        boolean flag = permission.contains("170");
        System.out.println(flag);
    }

    public static int findTargetSumWays(int[] nums, int target) {
        return test1(nums, target, nums.length - 1);
    }

    public static int test1(int[] nums, int target, int endIndex) {
        int count = 0;
        if (endIndex == 0) {
            if (nums[0] == target) {
                count++;
            }
            if (nums[0] == -target) {
                count++;
            }
            return count;
        }
        return test1(nums, target - nums[endIndex], endIndex - 1)
                + test1(nums, target + nums[endIndex], endIndex - 1);
    }
}
