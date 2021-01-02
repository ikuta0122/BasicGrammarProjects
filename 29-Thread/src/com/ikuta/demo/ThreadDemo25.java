package com.ikuta.demo;

/**
 * 主线程的守护线程
 */
class DemoThread25 extends Thread {
    @Override
    public void run() {//守护线程执行代码
        int i = -1;
        while (true) {
            System.out.println(Thread.currentThread().getName() + "--->" + (++i));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

/**
 * 关于守护线程/后台线程的简单实现
 */
public class ThreadDemo25 {
    public static void main(String[] args) {
        Thread currentThread = Thread.currentThread();
        currentThread.setName("主线程");
        Thread thread = new DemoThread25();
        thread.setName("守护线程");
        thread.setDaemon(true);//在启动守护线程之前将其设置为守护线程
        thread.start();

        for (int i = 0; i < 10; i++) {//主线程执行代码
            System.out.println(Thread.currentThread().getName() + "--->" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
