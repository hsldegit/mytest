package com.leetcode;

/**
 * @author huangshilu
 * @date 2021/4/22 16:12
 */
public class l_0028实现str {

    public static void main(String[] args) {
        String haystack = "aaa";
        String needle = "aaaa";
        System.out.println(strStr(haystack, needle));
    }

    public static int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }
        char[] a = haystack.toCharArray();
        char[] b = needle.toCharArray();
        if (a.length < b.length) {
            return -1;
        }
        for (int i = 0; i <= a.length - b.length; i++) {
            int m = i;
            int n = 0;
            while (m < a.length && n < b.length && a[m] == b[n]) {
                m++;
                n++;
                if (n == b.length) {
                    return i;
                }
            }
            continue;
        }
        return -1;
    }
}
