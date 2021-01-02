package com.ikuta.demo;

class DeadLockThread01 extends Thread {
    Object object1;
    Object object2;

    public DeadLockThread01(Object object1, Object object2) {
        super();
        this.object1 = object1;
        this.object2 = object2;
    }

    @Override
    public void run() {
        synchronized (object1) {
            try {
                Thread.sleep(1000 * 5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (object2) {
                System.out.println("未出现死锁");
            }
        }
    }
}

class DeadLockThread02 extends Thread {
    Object object1;
    Object object2;

    public DeadLockThread02(Object object1, Object object2) {
        super();
        this.object1 = object1;
        this.object2 = object2;
    }

    @Override
    public void run() {
        synchronized (object2) {
            try {
                Thread.sleep(1000 * 5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (object1) {
                System.out.println("未出现死锁");
            }
        }
    }
}

/**
 * 关于死锁DeadLock的理解
 * 线程thread1和线程thread2共享对象object1和object2
 * 线程thread1和线程thread2都设置对象锁,且object1和object2的对象锁顺序相反
 * CPU时间片:
 * thread1--[执行代码 + 阻塞事件]-->thread2--[执行代码 + 阻塞事件]
 * -->thread1[此时遭遇类锁被占用]--->thread2[此时遭遇类锁被占用]--->死锁现象/死循环
 */
public class ThreadDemo21 {
    public static void main(String[] args) {
        Object object1 = new Object();
        Object object2 = new Object();
        //线程thread1和线程thread2共享对象object1和object2
        Thread thread1 = new DeadLockThread01(object1, object2);
        Thread thread2 = new DeadLockThread02(object1, object2);
        thread1.setName("thread1");
        thread2.setName("thread2");
        //启动线程thread1和thread2,并且保证线程thread1先启动
        thread1.start();
        try {
            Thread.sleep(1000);//当前线程休眠1秒[线程thread2比线程thread1晚启动]
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread2.start();
    }
}
