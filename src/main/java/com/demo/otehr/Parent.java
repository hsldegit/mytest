package com.demo.otehr;

/**
 * @Authror huangshilu
 * @Date 2021/2/24 15:31
 */


public class Parent {



    static {
        A = 2;
    }

    public static int A = 1;


    static class Sub extends Parent{
        public static int B = A;
    }

    public static void main(String[] args) {
        //调整静态块的前后位置会导致结果不同
        System.out.println(Sub.B);
    }
}
