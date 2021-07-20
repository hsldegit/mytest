package com.leetcode;

/**
 * @author huangshilu
 * @date 2021/5/31 19:35
 */
public class l_0342四的冥 {
    public static void main(String[] args) {
        System.out.println(isPowerOfFour(2));
    }

    public static boolean isPowerOfFour(int n) {
        if (n == 1) {
            return true;
        }
        if (n < 4) {
            return false;
        }
        while (n >= 4 && n % 4 == 0) {
            n = n >>> 2;
        }
        return n == 1;
    }
}
