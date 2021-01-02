package com.ikuta.demo;

//实现线程的第一种方式:继承Thread类并重写run()方法
class DemoThread02 extends Thread {
    /**
     * run()中的代码运行在分支线程MyThread02中
     */
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {//运行在分支线程中
            System.out.println("分支线程--->" + i);
        }
    }
}

public class ThreadDemo02 {
    public static void main(String[] args) {
        DemoThread02 thread = new DemoThread02();//创建分支线程对象
        thread.start();//主线程main调用分支线程thread的start()方法启动分支线程thread

        for (int i = 0; i < 100; i++) {//运行在主线程中
            System.out.println("主线程--->" + i);
        }
    }
}
