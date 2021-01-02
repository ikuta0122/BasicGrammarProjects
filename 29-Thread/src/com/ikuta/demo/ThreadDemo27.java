package com.ikuta.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * 生产线程
 */
class Producer implements Runnable {
    private List list;

    public Producer(List list) {
        super();
        this.list = list;
    }

    @Override
    public void run() {
        while (true) {// 使用死循环来模拟一直生产
            synchronized (list) {// 给仓库对象list加锁
                try {
                    while (list.size() == 10) {// 等于10说明仓库满了
                        System.out.println(Thread.currentThread().getName() + "以达到最大容量，进行wait");
                        list.wait();// 表示生产线程进入等待状态，并且释放占有的list集合锁
                        System.out.println(Thread.currentThread().getName() + "退出wait");
                    }

                    // 程序执行到这里说明仓库未满,可以生产
                    Object obj = new Object();
                    list.add(obj);
                    System.out.println(Thread.currentThread().getName() + "--->" + obj);
                    list.notifyAll();// 唤醒消费线程
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

/**
 * 消费线程
 */
class Consumer implements Runnable {
    private List list;

    public Consumer(List list) {
        super();
        this.list = list;
    }

    @Override
    public void run() {
        while (true) {// 使用死循环来模拟一直消费
            synchronized (list) {// 给仓库对象list加锁
                try {
                    while (list.size() == 0) {// 等于0说明仓库空了
                        System.out.println(Thread.currentThread().getName() + "为空，进行wait");
                        list.wait();// 当前线程进入等待状态，并且释放占有锁
                        System.out.println(Thread.currentThread().getName() + "退出wait");
                    }

                    // 程序执行到这里说明仓库非空,可以消费
                    Object obj = list.remove(0);
                    System.out.println(Thread.currentThread().getName() + "--->" + obj);
                    list.notifyAll();// 唤醒生产线程
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

/**
 * 生产者/消费者模式的简单实现
 */
public class ThreadDemo27 {
    public static void main(String[] args) {
        // 创建一个共享的仓库对象
        List list = new ArrayList();

        // 创建生产者线程和消费者线程
        Thread thread1 = new Thread(new Producer(list));
        Thread thread2 = new Thread(new Consumer(list));
        thread1.setName("生产线程");
        thread2.setName("消费线程");
        thread1.start();
        try {
            Thread.sleep(1000 *5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread2.start();
    }
}
