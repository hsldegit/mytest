package com.leetcode;

import org.springframework.util.StringUtils;

/**
 * @Authror huangshilu
 * @Date 2020/12/18 17:57
 */


public class l_0072二维数组单次搜索 {

    public static void main(String[] args) {
        String s = "# CTE-08931\n" +
                "version:6.0.6\n" +
                "git_firewall:e936zd\n" +
                "arch_bits:64\n" +
                "\n" +
                "# E6S932-DB-Security-A01\n" +
                "mixDB:192.168.5.1\n" +
                "minDB:192.168.5.2\n";

        String[] split = s.split("\n");
        for (String s1 : split) {
            String[] split1 = s1.split(":");
            if (split1[0].equals("arch_bits")){
                System.out.println(split1[1]);
            }
        }

        //System.out.println("A:01".split(":")[1]);
    }

    public static boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; ++i) {
            for (int j = 0; j < board[i].length; ++j) {
                if (board[i][j] == word.charAt(0)) {
                    if (dfs(board, word, i, j, 0)) return true;
                }
            }
        }
        return false;
    }

    public static boolean dfs(char[][] board, String word, int i, int j, int k) {
        if (k == word.length()) {
            return true;
        }
        if (i < 0 || j < 0 || i >= board.length || j >= board[i].length) {
            return false;
        }

        if (word.charAt(k) != board[i][j]) {
            return false;
        }
        char t = board[i][j];
        board[i][j] = '0';
        boolean res = dfs(board, word, i + 1, j, k + 1) ||
                dfs(board, word, i - 1, j, k + 1) ||
                dfs(board, word, i, j + 1, k + 1) ||
                dfs(board, word, i, j - 1, k + 1);
        board[i][j] = t;
        return res;
    }

}
