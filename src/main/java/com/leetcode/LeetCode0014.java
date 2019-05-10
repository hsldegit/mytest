package com.leetcode;

/**
 * @author huangshilu
 * @date 2019/5/5 19:00
 * @description
 */
public class LeetCode0014 {


    public static void main(String[] args) {
        String[] arr = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(arr));
    }

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            char temp = '0';
            for (int j = 0, length = strs.length; j < length; j++) {

                if (i > strs[j].length() - 1) {
                    return sb.toString();
                }
                if (j == 0) {
                    temp = strs[j].charAt(i);
                }
                if (temp != strs[j].charAt(i)) {
                    return sb.toString();
                }
                if (j == strs.length - 1) {
                    sb.append(temp);
                }
            }
        }
        return sb.toString();
    }

}
