package com.demo.lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
        test2();
    }

    /**
     * 排序 截取
     */
    public static void test1() {

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


    public static void test2() {
        List<Stu> list = new ArrayList<>();
        Stu stu1 = new Stu();
        stu1.setId(1L);
        stu1.setName("sut1");
        list.add(stu1);
        Stu stu2 = new Stu();
        stu2.setId(1L);
        stu2.setName("sut2");
        list.add(stu2);
        Stu stu3 = new Stu();
        stu3.setId(3L);
        stu3.setName("sut3");
        list.add(stu3);

        Map<Long, List<Stu>> collect = list.stream().collect(Collectors.groupingBy(Stu::getId));
        System.out.println(collect);


        Map<Long, Stu> collect1 = list.stream().collect(Collectors.toMap(Stu::getId, a -> a, (k1, k2) -> k1));

    }


}

class Stu {

    private Long id;

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Stu{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
