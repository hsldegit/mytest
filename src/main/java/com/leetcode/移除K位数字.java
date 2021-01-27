package com.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Authror huangshilu
 * @Date 2020/12/2 17:11
 */
        /**
        给定一个以字符串表示的非负整数  num，移除这个数中的 k 位数字，使得剩下的数字最小。

        注意:

        num 的长度小于 10002 且  ≥ k。
        num 不会包含任何前导零。


        示例 1 :

        输入: num = "1432219", k = 3
        输出: "1219"
        解释: 移除掉三个数字 4, 3, 和 2 形成一个新的最小的数字 1219。
        示例 2 :

        输入: num = "10200", k = 1
        输出: "200"
        解释: 移掉首位的 1 剩下的数字为 200. 注意输出不能有任何前导零。
        示例 3 :

        输入: num = "10", k = 2
        输出: "0"
        解释: 从原数字移除所有的数字，剩余为空就是 0。*/

public class 移除K位数字 {

    public static void main(String[] args) {
        //000
        //String s = test1("1234567890", 9);
        double x = 30.27330043;
        double y = 31.97546376;
        double s =  x + Math.random() * (y - x);
        System.out.println(s);
    }

    public static String test1(String num, int k) {
        Stack<Integer> stack = new Stack();
        int remain = num.length() - k;
        for (int i = 0; i < num.length(); i++) {
            int item = Integer.parseInt(num.charAt(i) + "");
            while (stack.size() > 0 && stack.peek() > item && k > 0) {
                stack.pop();
                k--;
            }
            stack.push(item);
        }
        while (k > 0) {
            stack.pop();
            k--;
        }
        List<Integer> resultList = new ArrayList<>(stack);
        StringBuilder s = new StringBuilder();
        for (Integer integer : resultList) {
            s.append(integer);
        }
        String s1 = s.toString().replaceFirst("^0*", "");
        return s1.length() == 0 ? "0" : s1;
    }


}
