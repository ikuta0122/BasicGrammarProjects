package com.ikuta.demo;


/**
 * 线程的常用方法:void interrupt()唤醒正在休眠的线程
 */
public class ThreadDemo11 {
    public static void main(String[] args) {
        Thread thread = new Thread(new DemoThread11());
        thread.setName("thread");
        thread.start();
        try {
            Thread.sleep(1000 * 5);//当前线程休眠5秒
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.interrupt();//在当前线程中唤醒线程thread
    }
}

class DemoThread11 implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "--->begin");
        try {
            Thread.sleep(1000 * 60 * 60);//当前线程休眠1小时
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "--->end");
    }
}