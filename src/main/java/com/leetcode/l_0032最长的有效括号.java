package com.leetcode;

import com.alibaba.fastjson.JSON;
import com.bean.SafetylineTaskBaseCount;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.math.BigDecimal;
import java.util.*;

/**
 * @author huangshilu
 * @date 2021/6/17 16:55
 */
public class l_0032最长的有效括号 {
    public static void main(String[] args) {
        String s = "))(()";
        //{"needHandleCount":12,"totalCount":12,"tenant":"103001"}

    }



    public static int longestValidParentheses(String s) {
        int maxans = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.empty()) {
                    stack.push(i);
                } else {
                    maxans = Math.max(maxans, i - stack.peek());
                }
            }
        }
        return maxans;
    }


}
