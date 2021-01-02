package com.ikuta.demo;

/**
 * 线程的调度问题:static void yield()放弃当前线程获取的CPU时间片
 */
public class ThreadDemo15 {
    public static void main(String[] args) {
        Thread thread = new Thread(new DemoThread15());
        thread.setName("thread");
        thread.start();

        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "--->" + i);
        }
    }
}

class DemoThread15 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 10 == 0) {
                Thread.yield();
            }
            System.out.println(Thread.currentThread().getName() + "--->" + i);
        }
    }
}