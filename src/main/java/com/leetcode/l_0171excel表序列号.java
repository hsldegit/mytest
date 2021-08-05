package com.leetcode;

/**
 * @author huangshilu
 * @date 2021/7/30 14:17
 */
public class l_0171excel表序列号 {
    public static void main(String[] args) {
        System.out.println(titleToNumber("FXSHRXW"));
    }

    public static int titleToNumber(String columnTitle) {
        char[] chars = columnTitle.toCharArray();
        int length = chars.length;
        int total = 0;
        int abs = 1;
        for (int i = length - 1; i >= 0; i--) {
            total += (chars[i] - 64) * abs;
            abs = abs * 26;
        }
        return total;
    }
}
