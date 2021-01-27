package com.leetcode;

import java.math.BigDecimal;
import java.util.*;

/**
 * @Authror huangshilu
 * @Date 2020/12/4 15:50
 */


public class 去除重复字符要求剩下的字典序最小 {

    public static void main(String[] args) {
        System.out.println(removeDuplicateLetters("cbacdcbc"));
    }

    public static String removeDuplicateLetters(String s) {

        Map<Character, Integer> countMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Character item = s.charAt(i);
            if (!countMap.containsKey(item)) {
                countMap.put(item, 1);
            } else {
                Integer integer = countMap.get(item);
                countMap.put(item, integer + 1);
            }
        }
        Set<Character> set = new HashSet<>();
        Stack<Character> stack = new Stack();
        for (int i = 0; i < s.length(); i++) {
            Character item = s.charAt(i);
            if (!stack.contains(item)) {
                while (stack.size() > 0 && stack.peek() > item && countMap.get(stack.peek()) > 0) {
                    set.remove(stack.pop());
                }
                set.add(item);
                stack.push(item);
            }
            Integer integer = countMap.get(item);
            countMap.put(item, integer - 1);
        }
        String result = "";
        while (stack.size() > 0) {
            result = result + stack.pop();
        }

        return new StringBuffer(result).reverse().toString();
    }
}
