package com.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Authror huangshilu
 * @Date 2021/2/22 17:47
 */


public class l_0386字典序排数 {

    public static void main(String[] args) {
        List<Integer> list = lexicalOrder(13);
        System.out.println(list);
    }


    public static List<Integer> lexicalOrder(int n) {
        //1 10 11 12 2 3 4 5 6 7 8 9

        List list = new ArrayList(n);

        for (int i = 1; i < 10; i++) {
            aaaa(i, n, list);
        }
        return list;
    }

    public static void aaaa(int i, int n, List<Integer> list) {
        if (i > n) {
            return;
        }
        System.out.println("i=" + i);
        list.add(i);
        for (int j = 0; j < 10; j++) {
            //aaaa(i * 10 + j, n, list);
            int t = i * 10 + j;
            aaaa(t, n, list);
        }
    }

//    public static List<Integer> lexicalOrder(int n) {
//        List<Integer> list = new ArrayList<>();
//        for (int i = 1; i < 10; i++) {
//            dfs(n, i, list);
//        }
//        return list;
//    }
//
//    private static void dfs(int n, int i, List<Integer> list) {
//        if (i > n) {
//            return;
//        }
//        list.add(i);
//        for (int j = 0; j <= 9; j++) {
//            dfs(n, i * 10 + j, list);
//        }
//    }

}
