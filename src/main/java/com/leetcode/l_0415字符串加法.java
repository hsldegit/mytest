package com.leetcode;

import java.util.Map;
import java.util.Stack;

/**
 * @Authror huangshilu
 * @Date 2021/3/16 15:55
 */


public class l_0415字符串加法 {


    public static void main(String[] args) {
        System.out.println(addStrings("111", "999"));
    }


    public static String addStrings(String num1, String num2) {

        Stack<String> s1 = new Stack<>();
        Stack<String> s2 = new Stack<>();

        for (int i = 0; i < num1.length(); i++) {
            s1.push(num1.charAt(i) + "");
        }
        for (int i = 0; i < num2.length(); i++) {
            s2.push(num2.charAt(i) + "");
        }
        StringBuilder s = new StringBuilder();
        int jin = 0;
        while (!s1.isEmpty() || !s2.isEmpty()) {
            String a = "0";
            String b = "0";
            if (!s1.isEmpty()) {
                a = s1.pop();
            }
            if (!s2.isEmpty()) {
                b = s2.pop();
            }
            int result = cover(a) + cover(b) + jin;
            if (result > 9) {
                jin = 1;
                result = result - 10;
            } else {
                jin = 0;
            }
            s.append(result + "");
        }
        if (jin > 0) {
            s.append(jin + "");
        }
        return s.reverse().toString();
    }

    public static int cover(String a) {
        switch (a) {
            case "0":
                return 0;
            case "1":
                return 1;
            case "2":
                return 2;
            case "3":
                return 3;
            case "4":
                return 4;
            case "5":
                return 5;
            case "6":
                return 6;
            case "7":
                return 7;
            case "8":
                return 8;
            case "9":
                return 9;
        }
        return 0;
    }


}
