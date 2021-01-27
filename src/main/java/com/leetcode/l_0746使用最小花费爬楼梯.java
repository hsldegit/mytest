package com.leetcode;

/**
 * @Authror huangshilu
 * @Date 2020/12/21 16:12
 */


public class l_0746使用最小花费爬楼梯 {

    public static void main(String[] args) {
        int[] arr = {0, 2, 2, 1};
        System.out.println(minCostClimbingStairs1(arr));
    }

    public static int minCostClimbingStairs1(int[] cost) {
        int n = cost.length;
        if (n == 2) {
            return Math.min(cost[0], cost[1]);
        }
        for (int i = 2; i < n; i++) {
            cost[i] = cost[i] + Math.min(cost[i - 2], cost[i - 1]);
        }
        return Math.min(cost[n - 1], cost[n - 2]);
    }


    public static int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int prev = 0, curr = 0;
        for (int i = 2; i <= n; i++) {
            int next = Math.min(curr + cost[i - 1], prev + cost[i - 2]);
            prev = curr;
            curr = next;
        }
        return curr;

    }

    public static int test1(int[] cost, int i) {
        if (i == 0) {
            return cost[0];
        }
        if (i == 1) {
            return cost[1];
        }
        int a = test1(cost, i - 1) + cost[i];
        int b = test1(cost, i - 2) + cost[i - 1];
        return Math.min(a, b);
    }

//    public static int minCostClimbingStairs(int[] cost) {
//        int i = cost.length;
//        int totalCost = 0;
//        while (i > 1) {
//            if (cost[i - 2] <= cost[i - 1]) {
//                totalCost += cost[i - 2];
//                i = i - 2;
//            } else {
//                totalCost += cost[i - 1];
//                i = i - 1;
//            }
//        }
//        return totalCost;
//    }


}
