package com.thread.lock;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReadWriteLock;

/**
 *
 * 如果读写锁当前没有读者，也没有写者，那么写者可以立刻获的读写锁，否则必须自旋，直到没有任何的写锁或者读锁存在。
 * 如果读写锁没有写锁，那么读锁可以立马获取，否则必须等待写锁释放。
 * (但是有一个例外，就是读写锁中的锁降级操作，当同一个线程获取写锁后，在写锁没有释放的情况下可以获取读锁再释放读锁这就是锁降级的一个过程)
 * @author huangshilu
 * @date 2018/12/14 16:47
 * @description
 */
public class ReentrantReadWriteLockTest {
    class MyObject {
        private Object object;

        private ReadWriteLock lock = new java.util.concurrent.locks.ReentrantReadWriteLock();

        public void get() throws InterruptedException {
            lock.readLock().lock();//上读锁
            try {
                System.out.println(Thread.currentThread().getName() + "准备读取数据");
                Thread.sleep(new Random().nextInt(1000));
                System.out.println(Thread.currentThread().getName() + "读数据为：" + this.object);
            } finally {
                lock.readLock().unlock();
            }
        }

        public void put(Object object) throws InterruptedException {
            lock.writeLock().lock();
            try {
                System.out.println(Thread.currentThread().getName() + "准备写数据");
                Thread.sleep(new Random().nextInt(1000));
                this.object = object;
                System.out.println(Thread.currentThread().getName() + "写数据为" + this.object);
            } finally {
                lock.writeLock().unlock();
            }
        }
    }

    public static void main(String[] args) {
        final MyObject myObject = new ReentrantReadWriteLockTest().new MyObject();
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 3; i++) {
            executorService.execute(() -> {
                for (int j = 0; j < 3; j++) {
                    try {
                        myObject.put(new Random().nextInt(1000));//写操作
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }

        for (int i = 0; i < 3; i++) {
            executorService.execute(() -> {
                for (int j = 0; j < 3; j++) {
                    try {
                        myObject.get();//多个线程读取操作
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }

        executorService.shutdown();
    }

}
