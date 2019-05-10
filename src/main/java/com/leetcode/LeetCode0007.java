package com.leetcode;

/**
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 123
 * 输出: 321
 * 示例 2:
 * <p>
 * 输入: -123
 * 输出: -321
 * 示例 3:
 * <p>
 * 输入: 120
 * 输出: 21
 * 注意:
 * <p>
 * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231,  231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
 *
 * @author huangshilu
 * @date 2019/5/5 17:29
 * @description
 */
public class LeetCode0007 {


    public static void main(String[] args) {
        System.out.println(reverse(965));
    }

    public static int reverse(int x) {
        try {
            if (x >= 0) {
                StringBuilder s = new StringBuilder(x + "");
                return Integer.valueOf(s.reverse().toString());
            } else {
                StringBuilder s = new StringBuilder(Math.abs(x) + "");
                return 0 - Integer.valueOf(s.reverse().toString());
            }
        } catch (Exception e) {
            return 0;
        }
    }

}
