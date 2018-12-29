package com.jvm;

import static java.lang.System.out;

/**
 * @author huangshilu
 * @date 2018/12/17 17:35
 * @description
 */
public class ClassLoadTest {
//    public static void main(String[] args) {
//        try {
//            System.out.println(ClassLoader.getSystemClassLoader());
//            System.out.println(ClassLoader.getSystemClassLoader().getParent());
//            System.out.println(ClassLoader.getSystemClassLoader().getParent().getParent());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

    public static void main(String[] args) {

        try {
            //查看当前系统类路径中包含的路径条目
            out.println(System.getProperty("java.class.path"));
            System.out.println(System.getProperty("java.ext.dirs"));
            //调用加载当前类的类加载器（这里即为系统类加载器）加载TestBean
            Class typeLoaded = Class.forName("com.jvm.TestBean");

            String aa = new String("aaa");

            Class type = Class.forName("java.lang.String");

            out.println("aa:"+aa.getClass().getClassLoader());
            //查看被加载的TestBean类型是被那个类加载器加载的
            out.println(type.getClassLoader());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }


//    public static void main(String[] args) {
//        URL[] extURLs = ((URLClassLoader)ClassLoader.getSystemClassLoader().getParent()).getURLs();
//
//        for (int i = 0; i < extURLs.length; i++) {
//
//            System.out.println(extURLs[i]);
//
//        }
//    }
}
