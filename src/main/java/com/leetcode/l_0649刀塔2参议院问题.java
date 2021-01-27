package com.leetcode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @Authror huangshilu
 * @Date 2020/12/11 16:20
 */


public class l_0649刀塔2参议院问题 {

    public static void main(String[] args) {

    }

    public static String test1(String senate) {
        int length = senate.length();
        Queue<Integer> rStack = new LinkedList<>();
        Queue<Integer> dStack = new LinkedList<>();
        for (int i = 0; i < length; i++) {
            if ("R".equals(senate.charAt(i) + "")) {
                rStack.add(i);
            } else {
                dStack.add(i);
            }
        }
        while (!rStack.isEmpty() && !dStack.isEmpty()) {
            Integer r = rStack.remove();
            Integer d = dStack.remove();
            if (r < d) {
                rStack.offer(r + length);
            } else {
                dStack.offer(d + length);
            }
        }
        return rStack.isEmpty() ? "Dire" : "Radiant";
    }
}
