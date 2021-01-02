package com.ikuta.test;

/**
 * 关于sleep()方法的面试题:线程thread是否会进入休眠状态
 * 答案:不会.因为sleep()方法属于静态方法,只会让当前线程进入休眠状态
 * 效果:预期效果是线程thread休眠5秒,而实际效果是线程main休眠5秒
 * 结论:thread.sleep(1000 * 5);自动转换成:Thread.sleep(1000 * 5);
 */
public class ThreadTest01 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "--->" + i);
        }

        Thread thread = new TestThread01();
        thread.setName("thread");
        thread.start();
        try {
            thread.sleep(1000 * 5);//自动转换成:Thread.sleep(1000 * 5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class TestThread01 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "--->" + i);
        }
    }
}