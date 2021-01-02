package com.ikuta.demo;

class DemoClass19 {
    public synchronized void doSome() {//使用线程同步机制
        System.out.println("doSome begin");
        try {
            Thread.sleep(1000 * 5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("doSome over");
    }

    public synchronized void doOther() {//使用线程同步机制
        System.out.println("doOther begin");
        System.out.println("doOther over");
    }
}

class DemoThread19 extends Thread {
    private DemoClass19 demoClass;

    public DemoThread19(DemoClass19 demoClass) {
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
 * 线程异步机制和线程同步机制的理解:synchronized出现在实例方法上,且线程thread11和线程thread2的对象不共享
 * 问题:doOther()方法的执行需要等待doSome()方法的结束吗?
 * 答案:不需要.
 * 原因一:doSome()方法和doOther()方法属于线程同步机制而不属于线程异步机制
 * 原因二:synchronized关键字出现在实例方法表示共享对象是this,而线程t1和线程t2的对象不共享
 * 原因三:虽然doSome()方法和doOther()方法属于线程同步机制,但是线程t1和线程t2的对象不共享,不存在抢夺"锁标记"的问题
 */
public class ThreadDemo19 {
    public static void main(String[] args) {
        DemoClass19 demoClass1 = new DemoClass19();
        DemoClass19 demoClass2 = new DemoClass19();
        Thread thread1 = new DemoThread19(demoClass1);
        Thread thread2 = new DemoThread19(demoClass2);
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
