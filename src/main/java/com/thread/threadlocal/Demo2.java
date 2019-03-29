package com.thread.threadlocal;

import java.util.*;

/**
 * @author huangshilu
 * @date 2019/3/18 14:26
 * @description
 */
public class Demo2 {

    public static String a(Set<?> set) {
        return "set";
    }

    public static String a(List<?> set) {
        return "list";
    }

    public static String a(ArrayList<?> set) {
        return "array list";
    }

    public static String a(Collection<?> set) {
        return "unknown";
    }

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        System.out.println(a(list));
//        Collection a = new HashSet<String>();
//        System.out.println(a(a));
//        System.out.println(a(new HashSet<String>()));
//        System.out.println(a(new ArrayList<String>()));
//        System.out.println(a(new HashMap<String, String>().values()));
    }


}
