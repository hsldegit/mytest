package com.thread.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;

import static java.lang.System.out;

/**
 * ArrayList默认不是线程安全的 如果需要线程安全 可以用工具类转换一下
 *
 * @author huangshilu
 * @date 2018/12/13 16:13
 * @description
 */
public class ArrayListTest {


    public static void main(String[] args) throws Exception {

        CountDownLatch countDownLatch = new CountDownLatch(2);
        List list = new ArrayList();
        list = Collections.synchronizedList(list);
        AddToListThread addToListThread1 = new AddToListThread(list,countDownLatch);
        addToListThread1.setName("线程1");
        AddToListThread addToListThread2 = new AddToListThread(list,countDownLatch);
        addToListThread2.setName("线程2");
        addToListThread1.start();
        addToListThread2.start();

        //这里是等这俩线程跑完
        //addToListThread1.join();
        //addToListThread2.join();
        countDownLatch.await();
        out.println(list.size());

    }

}

class AddToListThread extends Thread {

    private List<Integer> list;

    private CountDownLatch countDownLatch;

    public AddToListThread(List<Integer> list,CountDownLatch countDownLatch) {
        this.list = list;
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        out.println(Thread.currentThread().getName() + ":执行开始");
        for (int i = 0; i < 1000; i++) {
            list.add(1);
        }
        out.println(Thread.currentThread().getName() + ":执行结束");
        countDownLatch.countDown();
    }
}