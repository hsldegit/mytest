package com.leetcode;

import java.util.*;

/**
 * @Authror huangshilu
 * @Date 2021/1/25 16:56
 */


public class l_0017电话号码的数字组合 {
    public static void main(String[] args) {

        System.out.println(letterCombinations("23"));

    }

    public static List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<String>();
        if (digits.length() == 0) {
            return combinations;
        }
        Map<Character, String> phoneMap = new HashMap<Character, String>() {{
            put('2', "abc");
            put('3', "def");
            put('4', "ghi");
            put('5', "jkl");
            put('6', "mno");
            put('7', "pqrs");
            put('8', "tuv");
            put('9', "wxyz");
        }};
        backtrack(combinations, phoneMap, digits, 0, new StringBuffer());
        return combinations;
    }

    public static void backtrack(List<String> combinations, Map<Character, String> phoneMap, String digits, int index, StringBuffer combination) {
        if (index == digits.length()) {
            combinations.add(combination.toString());
        } else {
            char digit = digits.charAt(index);
            String letters = phoneMap.get(digit);
            int lettersCount = letters.length();
            for (int i = 0; i < lettersCount; i++) {
                combination.append(letters.charAt(i));
                backtrack(combinations, phoneMap, digits, index + 1, combination);
                combination.deleteCharAt(index);
            }
        }
    }


//    public static List<String> letterCombinations(String digits) {
//        String[] a1 = {};
//        String[] a2 = {"a", "b", "c"};
//        String[] a3 = {"d", "e", "f"};
//        String[] a4 = {"g", "h", "i"};
//        String[] a5 = {"j", "k", "l"};
//        String[] a6 = {"m", "n", "o"};
//        String[] a7 = {"p", "q", "r", "s"};
//        String[] a8 = {"t", "u", "v"};
//        String[] a9 = {"w", "x", "y", "z"};
//
//        Map<String, List<String>> map = new HashMap<>();
//        map.put("1", Arrays.asList(""));
//        map.put("2", Arrays.asList("a", "b", "c"));
//        map.put("3", Arrays.asList("d", "e", "f"));
//        map.put("4", Arrays.asList("g", "h", "i"));
//        map.put("5", Arrays.asList("j", "k", "l"));
//        map.put("6", Arrays.asList("m", "n", "o"));
//        map.put("7", Arrays.asList("p", "q", "r", "s"));
//        map.put("8", Arrays.asList("t", "u", "v"));
//        map.put("9", Arrays.asList("w", "x", "y", "z"));
//
//        List<List<String>> list = new ArrayList<>();
//        for (int i = 0; i < digits.length(); i++) {
//            String s = digits.charAt(i) + "";
//            list.add(map.get(s));
//        }
//
//
//        return null;
//    }


}
