package com.leetcode;

import java.util.Stack;

/**
 * @author huangshilu
 * @date 2021/5/27 19:19
 */
public class l_0461汉明距离 {
    public static void main(String[] args) {
        System.out.println(hammingDistance(1, 4));
    }

    public static int hammingDistance(int x, int y) {
        char[] s1 = Integer.toBinaryString(x).toCharArray();
        char[] s2 = Integer.toBinaryString(y).toCharArray();
        if (s1.length < s2.length) {
            char[] temp = s1;
            s1 = s2;
            s2 = temp;
        }
        int m = s1.length;
        int n = s2.length;
        int c = m - n;

        int total = 0;
        for (int i = 0; i < m; i++) {
            if (i < c) {
                if (s1[i] != '0') {
                    total++;
                }
                continue;
            }
            if (s1[i] != s2[i - c]) {
                total++;
                continue;
            }
        }
        return total;
    }
}
