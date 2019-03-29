package com.thread.lock;

/**
 * @author huangshilu
 * @date 2019/3/13 13:59
 * @description
 */
public class DeadLock {


    public static void main(String[] args) {
        Object object1 = new Object();
        Object object2 = new Object();

        Thread thread1 = new Thread(new Lock1(object1, object2));
        thread1.setName("thread1");
        Thread thread2 = new Thread(new Lock2(object1, object2));
        thread2.setName("thread2");

        thread1.start();
        thread2.start();
    }


}


class Lock1 implements Runnable {

    private Object object1;

    private Object object2;

    public Lock1(Object object1, Object object2) {
        this.object1 = object1;
        this.object2 = object2;
    }

    @Override
    public void run() {
        try {
            synchronized (object1) {
                System.out.println(Thread.currentThread().getName() + "Lock obj1 success");
                Thread.sleep(5000);
                synchronized (object2) {
                    System.out.println(Thread.currentThread().getName() + "Lock obj2 success");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


class Lock2 implements Runnable {

    private Object object1;

    private Object object2;

    public Lock2(Object object1, Object object2) {
        this.object1 = object1;
        this.object2 = object2;
    }

    @Override
    public void run() {
        try {
            synchronized (object2) {
                System.out.println(Thread.currentThread().getName() + "Lock obj2 success");
                Thread.sleep(5000);
                synchronized (object1) {
                    System.out.println(Thread.currentThread().getName() + "Lock obj1 success");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
