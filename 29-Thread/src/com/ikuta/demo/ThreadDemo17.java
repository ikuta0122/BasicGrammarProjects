package com.ikuta.demo;

class DemoClass17 {
    public synchronized void doSome() {
        System.out.println("doSome begin");
        try {
            Thread.sleep(1000 * 5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("doSome over");
    }

    public void doOther() {
        System.out.println("doOther begin");
        System.out.println("doOther over");
    }
}

class DemoThread17 extends Thread {
    private DemoClass17 demoClass;

    public DemoThread17(DemoClass17 demoClass) {
        super();
        this.demoClass = demoClass;
    }

    @Override
    public void run() {
        if ("thread1".equals(Thread.currentThread().getName())) {
            demoClass.doSome();
        } else if ("thread2".equals(Thread.currentThread().getName())) {
            demoClass.doOther();
        }
    }
}

/**
 * 线程异步机制和线程同步机制的理解:没有使用synchronized
 * 问题:doOther()方法的执行需要等待doSome()方法的结束吗?
 * 答案:不需要.
 * CPU时间片:thread1--[执行代码 + 阻塞事件]-->thread2--[执行代码]-->thread1
 * 原因一:doSome()方法和doOther()方法属于线程异步机制而不属于线程同步机制
 * 原因二:多线程并发的情况下,就绪状态的线程需要抢夺CPU时间片才能进入运行状态执行run()方法[线程thread1抢夺到CPU时间片]
 * 原因三:多线程并发的情况下,运行状态的线程遭遇阻塞事件后,线程进入阻塞状态并放弃CPU时间片[线程thread1放弃其CPU时间片]
 */
public class ThreadDemo17 {
    public static void main(String[] args) {
        DemoClass17 demoClass = new DemoClass17();
        Thread thread1 = new DemoThread17(demoClass);
        Thread thread2 = new DemoThread17(demoClass);
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