package com.demo.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.stream.Collectors;

/**
 * @author huangshilu
 * @date 2019/3/13 14:59
 * @description
 */
public class Demo1 {

    public static void main(String[] args) {
        test1();
    }

    /**
     * 排序 截取
     */
    public static void test1(){

        List<String> strings = new ArrayList<>();
        strings.add("aaa");
        strings.add("bb");
        strings.add("a");
        strings.add("aaaaaac");

        List<String> collect = strings.stream().sorted((o1, o2) -> {
            return o1.length() - o2.length();
        }).limit(10).collect(Collectors.toList());

        System.out.println(collect);
    }


}
