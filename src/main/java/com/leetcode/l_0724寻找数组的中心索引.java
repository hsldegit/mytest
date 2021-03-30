package com.leetcode;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @Authror huangshilu
 * @Date 2021/1/28 15:17
 */


public class l_0724寻找数组的中心索引 {

    public static void main(String[] args) {
        int[] arr = {1, 7, 3, 6, 5, 6};
        System.out.println(pivotIndex(arr));
    }

    public static int pivotIndex(int[] nums) {
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            total = total + nums[i];
        }
        int index = -1;
        int leftTotal = 0;
        for (int i = 0; i < nums.length; i++) {
            //leftTotal = leftTotal + nums[i - 1];
            if (leftTotal == total - leftTotal - nums[i]) {
                index = i;
                break;
            }
            leftTotal = leftTotal + nums[i];
        }
        return index;
    }



}
