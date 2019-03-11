package com.demo.otehr;

/**
 * @author huangshilu
 * @date 2019/2/20 15:14
 * @description
 */
public class TestC {

    private int i = 6;

    public int add() {
        return 1;
    }

    public int del() {
        return 2;
    }

    public int aaa() {
        try {
            return 1;
        } finally {
            System.out.println("finally");
            return 2;
        }
    }


    public static void main(String[] args) {
        TestC t = new TestC();
        System.out.println(t.aaa());
    }


}
