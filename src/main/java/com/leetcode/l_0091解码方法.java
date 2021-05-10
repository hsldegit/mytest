package com.leetcode;

/**
 * @author huangshilu
 * @date 2021/4/21 17:29
 */
public class l_0091解码方法 {
    public static void main(String[] args) {
        String s = "12";
        System.out.println(numDecodings(s));
    }

    public static int numDecodings(String s) {
        int n = s.length();
        int[] f = new int[n + 1];
        f[0] = 1;
        for (int i = 1; i <= n; ++i) {
            if (s.charAt(i - 1) != '0') {
                f[i] = f[i] + f[i - 1];
            }
            if (i > 1 && s.charAt(i - 2) != '0' && ((s.charAt(i - 2) - '0') * 10 + (s.charAt(i - 1) - '0') <= 26)) {
                f[i] = f[i] + f[i - 2];
            }
        }
        return f[n];
    }

}
