package com.jvm;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import static java.lang.System.in;
import static java.lang.System.out;

/**
 * @author huangshilu
 * @date 2018/12/18 10:54
 * @description
 */
public class TestBean {

    public TestBean() {


    }


    public static void main(String[] args) {

//        //["flower","flow","flight"]
//        String[] strs = {"flower", "flow", "flight"};
//        StringBuilder result = new StringBuilder();
//        int minLength = Integer.MAX_VALUE;
//        for (int i = 0; i < strs.length; i++) {
//            if (strs[i].length() < minLength) {
//                minLength = strs[i].length();
//            }
//        }
//        for (int i = 0; i < minLength; i++) {
//            boolean exit = false;
//            char x = strs[0].charAt(i);
//            for (int j = 0; j < strs.length; j++) {
//                if (strs[j].charAt(i) != x) {
//                    exit = true;
//                    break;
//                }
//            }
//            if (exit) {
//                break;
//            } else {
//                result.append(x);
//            }
//        }
//        System.out.println(result.toString());


        String str1 = "()";
        String str2 = "()[]{}";
        String str3 = "(]";
        String str4 = "([)]";
        String str5 = "{[]}";
        String str6 = "(([]){})";
        out.println(isValid1(str6));

    }

    public static boolean isValid(String s) {
        if (s == null) {
            return false;
        }
        if (s.length() == 0) {
            return true;
        }
        if (s.length() == 1) {
            return false;
        }
        int index = -1;
        for (int i = 0; i < s.length()-1 ; i++) {
            if(isSym(s.charAt(i),s.charAt(i+1))){
                index = i;
                break;
            }
        }
        if (index >= 0){
            String nexString = s.substring(0,index)+s.substring(index+2);
            return isValid(nexString);
        }
        return  false;
    }


    public static boolean isValid1(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            if (stack.size() == 0) {
                stack.push(aChar);
            } else if (isSym(stack.peek(), aChar)) {
                stack.pop();
            } else {
                stack.push(aChar);
            }
        }
        return stack.size() == 0;
    }

    private static boolean isSym(char c1, char c2) {
        return (c1 == '(' && c2 == ')') || (c1 == '[' && c2 == ']') || (c1 == '{' && c2 == '}');
    }
}
