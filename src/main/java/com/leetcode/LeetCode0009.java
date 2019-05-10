package com.leetcode;

/**
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 121
 * 输出: true
 * 示例 2:
 * <p>
 * 输入: -121
 * 输出: false
 * 解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
 * 示例 3:
 * <p>
 * 输入: 10
 * 输出: false
 * 解释: 从右向左读, 为 01 。因此它不是一个回文数。
 *
 * @author huangshilu
 * @date 2019/5/5 17:41
 * @description
 */
public class LeetCode0009 {


    public static void main(String[] args) {
        System.out.println(isPalindrome(1234));
    }

    public static boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }

        int rev = 0;
        while (x > 0) {
            int pop = x % 10;
            x = x / 10;
            rev = rev * 10 + pop;
        }
        System.out.println(rev);
        return false;
    }


}
