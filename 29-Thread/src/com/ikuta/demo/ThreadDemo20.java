package com.ikuta.demo;

class DemoClass20 {
    public synchronized static void doSome() {//使用线程同步机制
        System.out.println("doSome begin");
        try {
            Thread.sleep(1000 * 5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("doSome over");
    }

    public synchronized static void doOther() {//使用线程同步机制
        System.out.println("doOther begin");
        System.out.println("doOther over");
    }
}

class DemoThread20 extends Thread {
    private DemoClass20 demoClass;

    public DemoThread20(DemoClass20 demoClass) {
        super();
        this.demoClass = demoClass;
    }

    @Override
    public void run() {
        if ("thread1".equals(Thread.currentThread().getName())) {
            DemoClass20.doSome();
        } else if ("thread2".equals(Thread.currentThread().getName())) {
            DemoClass20.doOther();
        }
    }
}

/**
 * 线程异步机制和线程同步机制的理解:synchronized出现在静态方法上
 * 问题:doOther()方法的执行需要等待doSome()方法的结束吗?
 * 答案:需要.
 * 原因一:doSome()方法和doOther()方法属于线程同步机制而不属于线程异步机制
 * 原因二:synchronized出现在静态方法上表示线程对象寻找"类锁"才能进入就绪状态
 * 原因三:每个类有且只有一个"类锁"
 */
public class ThreadDemo20 {
    public static void main(String[] args) {
        DemoClass20 demoClass1 = new DemoClass20();
        DemoClass20 demoClass2 = new DemoClass20();
        Thread thread1 = new DemoThread20(demoClass1);
        Thread thread2 = new DemoThread20(demoClass2);
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
