package com.leetcode;

/**
 * @Authror huangshilu
 * @Date 2021/1/5 15:27
 */


public class l_0010正则表达式 {

    public static void main(String[] args) {
        String s = "aab";
        String p = "c*a*b";
        System.out.println(isMatch(s, p));
    }

    public static boolean isMatch(String s, String p) {


        return s.matches(p);
    }

}
