package com.leetcode;

import javax.validation.constraints.Max;
import java.util.HashMap;
import java.util.Map;

/**
 * @Authror huangshilu
 * @Date 2021/2/26 17:36
 */


public class 挖金矿 {


    public static void main(String[] args) {
        Map map = new HashMap<>();
        //总人数
        int w = 10;
        //金矿数量
        int n = 5;
        //金矿需要的人数量
        int[] p = {5, 5, 3, 4, 5};
        //金矿含金量
        int[] g = {400, 500, 200, 300, 350};
        int i = test1(w, n, p, g);
        System.out.println(i);
    }

    //f(n,w) = f(n-1,w) n>1 w<p[n-1]
    //f(n,w) = max(f(n-1,w),f(n-1,w-p[n-1])+g[n-1]) n>1 w>=p[n-1]
    public static int test1(int w, int n, int[] p, int[] g) {
        int[][] arr = new int[g.length + 1][w + 1];
        for (int i = 1; i <= g.length; i++) {
            for (int j = 1; j <= w; j++) {
                if (j < p[i - 1]) {
                    arr[i][j] = arr[i - 1][j];
                } else {
                    arr[i][j] = Math.max(arr[i - 1][j], arr[i - 1][j - p[i - 1]] + g[i - 1]);
                }
            }
        }
        return arr[g.length][w];
    }

}
