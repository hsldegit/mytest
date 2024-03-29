package com.thread.coustomer;

/**
 * 生产者消费者模式
 * @author huangshilu
 * @date 2018/12/13 15:27
 * @description
 */
public class ProducerConsumerWithWaitNofity {
    public static void main(String[] args) {
        Resource resource = new Resource();
        //生产者线程
        ProducerThread p1 = new ProducerThread(resource);
        p1.setName("生产者1");
        ProducerThread p2 = new ProducerThread(resource);
        p2.setName("生产者2");
        ProducerThread p3 = new ProducerThread(resource);
        p3.setName("生产者3");
        //消费者线程
        ConsumerThread c1 = new ConsumerThread(resource);
        c1.setName("消费者1");
        //ConsumerThread c2 = new ConsumerThread(resource);
        //ConsumerThread c3 = new ConsumerThread(resource);
        //common request
        p1.start();
        p2.start();
        p3.start();
        c1.start();
        //c2.start();
        //c3.start();
    }
}

/**
 * 公共资源类
 *
 * @author
 */
class Resource {
    //重要
    //当前资源数量
    private int num = 0;
    //资源池中允许存放的资源数目
    private int size = 10;

    /**
     * 从资源池中取走资源
     */
    public synchronized void remove() {
        if (num > 0) {
            num--;
            System.out.println("消费者" + Thread.currentThread().getName() +
                    "消耗一件资源，" + "当前线程池有" + num + "个");
            notifyAll();//通知生产者生产资源
        } else {
            try {
                //如果没有资源，则消费者进入等待状态
                wait();
                System.out.println("消费者" + Thread.currentThread().getName() + "线程进入等待状态");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 向资源池中添加资源
     */
    public synchronized void add() {
        if (num < size) {
            num++;
            System.out.println(Thread.currentThread().getName() + "生产一件资源，当前资源池有"
                    + num + "个");
            //通知等待的消费者
            notifyAll();
        } else {
            //如果当前资源池中有10件资源
            try {
                wait();//生产者进入等待状态，并释放锁
                System.out.println(Thread.currentThread().getName() + "线程进入等待");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

/**
 * 消费者线程
 */
class ConsumerThread extends Thread {
    private Resource resource;

    public ConsumerThread(Resource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            resource.remove();
        }
    }
}

/**
 * 生产者线程
 */
class ProducerThread extends Thread {
    private Resource resource;

    public ProducerThread(Resource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        //不断地生产资源
        while (true) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            resource.add();
        }
    }

}