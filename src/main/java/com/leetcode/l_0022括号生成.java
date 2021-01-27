package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Authror huangshilu
 * @Date 2021/1/25 18:21
 */


public class l_0022括号生成 {

    public static void main(String[] args) {

        //System.out.println(generateParenthesis(3));

        String[] arr1 = {"(((())))","((()()))","((())())","((()))()","(()(()))","(()()())","(()())()","(())(())","(())()()","()((()))","()(()())","()(())()","()()(())","()()()()"};
        String[] arr2 = {"()()()()","(()()())","(()())()","((()()))","()(()())","(())()()","((())())","()(())()","((()))()","(((())))","()((()))","()(())()","(()(()))","()()(())"};

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }

    public static List<String> generateParenthesis(int n) {
        List<String> nResult = new ArrayList<>();
        nResult.add("()");
        int index = 1;
        return aaa(index, n, nResult);
    }


    public static List<String> aaa(int index, int n, List<String> nResult) {
        if (index == n) {
            return nResult;
        } else {
            List<String> xxxList = new ArrayList<>();
            for (String s : nResult) {
                String a = s + "()";
                String b = "()" + s;
                String c = "(" + s + ")";
                xxxList.add(a);
                xxxList.add(c);
                if (!a.equals(b)) {
                    xxxList.add(b);
                }
            }
            return aaa(index + 1, n, xxxList);
        }
    }

}
