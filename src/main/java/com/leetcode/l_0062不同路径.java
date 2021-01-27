package com.leetcode;

/**
 * @Authror huangshilu
 * @Date 2020/12/9 16:33
 */


public class l_0062不同路径 {

    public static void main(String[] args) {
        System.out.println(test2(3, 7));
    }

    public static int test1(int m, int n) {
        int[][] resultTable = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0) {
                    resultTable[i][j] = 1;
                    continue;
                }
                resultTable[i][j] = resultTable[i][j - 1] + resultTable[i - 1][j];
            }
        }
        return resultTable[m - 1][n - 1];
    }


    public static int test2(int m, int n) {
        if (m == 1 || n == 1) {
            return 1;
        }
        return test2(m - 1, n) + test2(m, n - 1);
    }
}
