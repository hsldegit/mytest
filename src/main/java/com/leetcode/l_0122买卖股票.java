package com.leetcode;

import java.util.Arrays;

/**
 * @Authror huangshilu
 * @Date 2020/12/15 18:23
 */


public class l_0122买卖股票 {

    public static void main(String[] args) {
        //int[] arr = {7,1,5,3,6,4};
        // System.out.println(maxProfit(arr));
        System.out.println(711175%64);
    }

    public static int maxProfit(int[] prices) {
        int totalNum = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i - 1] < prices[i]) {
                totalNum = totalNum + (prices[i] - prices[i - 1]);
            }
        }
        return totalNum;
    }

}
