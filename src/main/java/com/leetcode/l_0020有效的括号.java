package com.leetcode;

import java.util.Stack;

/**
 * @author huangshilu
 * @date 2021/5/12 17:16
 */
public class l_0020有效的括号 {
    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < chars.length; i++) {
            if (!stack.isEmpty() && isMatch(stack.peek().charValue(), chars[i])) {
                stack.pop();
            } else {
                stack.push(chars[i]);
            }
        }
        return stack.isEmpty();
    }

    public static boolean isMatch(char c1, char c2) {
        if (c1 == '{' && c2 == '}') {
            return true;
        }
        if (c1 == '[' && c2 == ']') {
            return true;
        }
        if (c1 == '(' && c2 == ')') {
            return true;
        }
        return false;
    }


}
