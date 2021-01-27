package com.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Authror huangshilu
 * @Date 2020/12/23 16:55
 */


public class l_0387字符串唯一的字符 {

    public static void main(String[] args) {
        System.out.println(firstUniqChar("loveleetcode"));

    }

    public static int firstUniqChar2(String s) {

        int[] arr = new int[26];

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 97]++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (arr[s.charAt(i) - 97] == 1) {
                return i;
            }
        }

        return -1;
    }

    public static int firstUniqChar(String s) {

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Character character = s.charAt(i);
            if (map.containsKey(character)) {
                map.put(character, map.get(character) + 1);
            } else {
                map.put(character, 1);
            }
        }

        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}
