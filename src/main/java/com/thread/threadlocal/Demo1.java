package com.thread.threadlocal;

/**
 * @author huangshilu
 * @date 2019/3/13 15:55
 * @description
 */
public class Demo1 {


    ThreadLocal<Long> longLocal = new ThreadLocal<>();

    ThreadLocal<String> stringLocal = new ThreadLocal<>();


    public void set() {
        longLocal.set(Thread.currentThread().getId());
        stringLocal.set(Thread.currentThread().getName());
    }

    public long getLong() {
        return longLocal.get();
    }

    public String getString() {
        return stringLocal.get();
    }


    public static void main(String[] args) throws Exception{
        final Demo1 test = new Demo1();
        //test.set();
        System.out.println(test.getLong());
        System.out.println(test.getString());


        Thread thread1 = new Thread(){
            public void run() {
                test.set();
                System.out.println(test.getLong());
                System.out.println(test.getString());
            };
        };
        thread1.start();
        thread1.join();

        System.out.println(test.getLong());
        System.out.println(test.getString());

    }

}
