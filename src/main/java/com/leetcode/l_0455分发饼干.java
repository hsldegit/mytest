package com.leetcode;

import com.sun.deploy.uitoolkit.impl.awt.AWTDragHelper;

import java.util.Arrays;

/**
 * @Authror huangshilu
 * @Date 2020/12/25 14:44
 */


public class l_0455分发饼干 {

    public static void main(String[] args) {
        int[] g = {1, 2, 3};
        int[] s = {1, 1};
        System.out.println(g.length);
        System.out.println(findContentChildren2(g, s));
    }

    public static int findContentChildren2(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int result = 0;
        int j = 0;
        for (int i = 0; i < g.length; i++) {
            if (j > s.length - 1) {
                break;
            }
            while (g[i] > s[j]) {
                if (j == s.length - 1) {
                    return result;
                }
                j++;
            }
            j++;
            result++;
        }
        return result;
    }

    public static int findContentChildren(int[] g, int[] s) {
        int result = 0;
        for (int i = 0; i < g.length; i++) {
            int a = g[i];
            int temp = Integer.MAX_VALUE;
            int index = -1;
            for (int j = 0; j < s.length; j++) {
                if (s[j] >= a && s[j] <= temp) {
                    temp = s[j];
                    index = j;
                }
            }
            if (index >= 0) {
                s[index] = -1;
                result++;
            }
        }
        return result;
    }

}
