package com.ikuta.demo;

/**
 * 线程的调度问题:void join()合并线程,等待该线程结束后再执行当前线程
 */
public class ThreadDemo16 {
    public static void main(String[] args) {
        System.out.println("main begin");
        Thread thread = new Thread(new DemoThread16());
        thread.setName("thread");
        thread.start();
        try {
            thread.join();//合并线程,等待线程thread执行结束后再执行线程main
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main over");
    }
}

class DemoThread16 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "--->" + i);
        }
    }
}
