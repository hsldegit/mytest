package com.leetcode;

/**
 * @author huangshilu
 * @date 2021/5/21 16:03
 */
public class l_1035不相交的线 {

    public static void main(String[] args) {

    }


    public static int maxUncrossedLines(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            int a = nums1[i - 1];
            for (int j = 1; j <= n; j++) {
                int b = nums2[j - 1];
                if (a == b) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[m][n];
    }
}
