package com.leetcode;

/**
 * @Authror huangshilu
 * @Date 2021/1/4 16:41
 */


public class l_509斐波那契数 {

    public static void main(String[] args) {
        System.out.println(fib2(6));
    }

    public static int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        //n==4;
        int n1 = 1;
        int n2 = 0;
        int result = 0;
        for (int i = 2; i <= n; i++) {
            result = n1 + n2;
            n2 = n1;
            n1 = result;
        }
        return result;
    }


    public static int fib2(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int[] arr = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n];
    }

}
