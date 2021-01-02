package com.ikuta.demo;

//线程的常用方法:static void sleep(long mills)当前线程进入休眠,进入"阻塞状态"
public class ThreadDemo10 {
    public static void main(String[] args) {
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
