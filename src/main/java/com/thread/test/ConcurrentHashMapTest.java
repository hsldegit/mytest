package com.thread.test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;

/**
 * @author huangshilu
 * @date 2018/12/14 10:49
 * @description
 */
public class ConcurrentHashMapTest {

    public static void main(String[] args) throws Exception {

        final CountDownLatch countDownLatch1 = new CountDownLatch(1000);
        final CountDownLatch countDownLatch2 = new CountDownLatch(1000);
        final CountDownLatch countDownLatch3 = new CountDownLatch(1000);

        //HashMap不是线程安全的,通过 Collections.synchronizedMap()转换成线程安全的.
        final Map<String, Integer> hm = Collections.synchronizedMap(new HashMap<>());
        //HashTable内部自带同步,线程安全的.
        final Map<String, Integer> ht = new Hashtable<>();
        //JDK1.5之后提供的并发集合.
        final Map<String, Integer> chm = new ConcurrentHashMap<>();
        //putMap(hm,countDownLatch1);//输出:234 248 258
        //putMap(ht,countDownLatch2);//输出:249 210 221
        //putMap(chm,countDownLatch3);//输出:171 170 164数据量达到一定程度之后,会比前两种快3~4倍左右.

        //7592
        //9481
        //9569
    }

    private static void putMap(final Map<String, Integer> hm,CountDownLatch countDownLatch) throws InterruptedException {

        long begin = System.currentTimeMillis();
            for (int i = 0; i < 1000; i++) {//1000条线程
                final String key = "aaa"+ i;
                new Thread(() -> {
                    for (int j = 0; j < 1000; j++) {//每条线程向其中添加1000次
                        hm.put(key, j);
                    }
                    countDownLatch.countDown();
                }).start();
            }
        countDownLatch.await();
        long end = System.currentTimeMillis();
        System.out.println(hm.getClass().toString() + "执行完毕 一共耗时" + (end - begin) + "ms");
    }
}
