package com.ikuta.demo;

/**
 * 线程的常用方法:stop()强行终止线程执行[容易丢失数据]
 */
public class ThreadDemo12 {
    public static void main(String[] args) {
        Thread thread = new Thread(new DemoThread12());
        thread.setName("thread");
        thread.start();
        try {
            Thread.sleep(1000 * 5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.stop();//不建议使用stop()方法强行终止线程执行
    }
}

class DemoThread12 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "--->" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}