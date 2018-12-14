package com.thread.test;

/**
 * 一定要注意哪个对象正被用于锁定：
 * 1、调用同一个对象中非静态同步方法的线程是互斥的。如果是不同对象，则每个线程有自己的对象的锁，线程间彼此互不干预。
 * 2、调用同一个类中的静态同步方法的线程将是互斥的，它们都是锁定在相同的Class对象上。
 * 3、静态同步方法和非静态同步方法将永远不是互斥的，因为静态方法锁定在Class对象上，非静态方法锁定在该类的对象上。
 * 4、对于同步代码块，要看清楚什么对象已经用于锁定（synchronized后面括号的内容）。在同一个对象上进行同步的线程将是互斥的，在不同对象上锁定的线程将永远不会互斥。
 *
 * @author huangshilu
 * @date 2018/12/13 14:30
 * @description
 */
public class SyncObjectTest {

    public static void main(String[] args) {
        SyncDemo demo1 = new SyncDemo();
        SyncDemo demo2 = new SyncDemo();

        //不同对象sync锁不起作用
//        DemoThread1 demoThread1 = new DemoThread1(demo1);
//        DemoThread2 demoThread2 = new DemoThread2(demo2);
//        demoThread1.start();
//        demoThread2.start();

        //同一个对象 不同的sync方法互斥
//        DemoThread1 demoThread1 = new DemoThread1(demo1);
//        DemoThread2 demoThread2 = new DemoThread2(demo1);
//        demoThread1.start();
//        demoThread2.start();

        //静态方法加锁 相当于class对象加锁 互斥
//        DemoStaticThread1 demoStaticThread1 = new DemoStaticThread1();
//        DemoStaticThread2 demoStaticThread2 = new DemoStaticThread2();
//        demoStaticThread1.start();
//        demoStaticThread2.start();

        //静态方法和普通方法 不互斥 锁的不是一个对象 哪怕是静态方法通过new 出来的对象使用 也不影响
        DemoThread1 demoThread1 = new DemoThread1(demo1);
        DemoStaticThread1 demoStaticThread1 = new DemoStaticThread1();
        demoThread1.start();
        demoStaticThread1.start();
    }


}



class DemoThread1 extends Thread {

    private SyncDemo syncDemo;

    public DemoThread1(SyncDemo syncDemo) {
        this.syncDemo = syncDemo;
    }

    @Override
    public void run() {
        try {
            syncDemo.testMethod1();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class DemoThread2 extends Thread {

    private SyncDemo syncDemo;

    public DemoThread2(SyncDemo syncDemo) {
        this.syncDemo = syncDemo;
    }

    @Override
    public void run() {
        try {
            syncDemo.testMethod2();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class DemoStaticThread1 extends Thread {


//    private SyncDemo syncDemo;
//
//    public DemoStaticThread1(SyncDemo syncDemo) {
//        this.syncDemo = syncDemo;
//    }



    @Override
    public void run() {
        try {
            SyncDemo.testStaticMethod1();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class DemoStaticThread2 extends Thread {
    @Override
    public void run() {
        try {
            SyncDemo.testStaticMethod2();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}




class SyncDemo {

    public synchronized void testMethod1() throws InterruptedException {
        for (int i = 0; i < 3; i++) {
            Thread.sleep(1000);
            System.out.println("function testMethod1 running...");
        }
    }

    public synchronized void testMethod2() throws InterruptedException {
        for (int i = 0; i < 3; i++) {
            Thread.sleep(1000);
            System.out.println("function testMethod2 running...");
        }
    }

    public static synchronized void testStaticMethod1() throws InterruptedException {
        for (int i = 0; i < 3; i++) {
            Thread.sleep(1000);
            System.out.println("function testStaticMethod1 running...");
        }
    }

    public static synchronized void testStaticMethod2() throws InterruptedException {
        for (int i = 0; i < 3; i++) {
            Thread.sleep(1000);
            System.out.println("function testStaticMethod2 running...");
        }
    }



}








