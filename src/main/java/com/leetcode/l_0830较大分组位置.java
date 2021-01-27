package com.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Authror huangshilu
 * @Date 2021/1/5 14:58
 */


public class l_0830较大分组位置 {

    public static void main(String[] args) {
        String s1 = "abcdddeeeeaabbbcd";
        System.out.println(largeGroupPositions(s1));
    }

    public static List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> result = new ArrayList<>();
        int i = 0;
        while (i < s.length()) {
            int start = i;
            int end = i;
            char c = s.charAt(i);
            while (end < s.length() && c == s.charAt(end)) {
                end++;
            }
            if (end - start >= 3) {
                List<Integer> list = new ArrayList<>();
                list.add(start);
                list.add(end - 1);
                result.add(list);
            }
            i = end;
        }
        return result;
    }

}
