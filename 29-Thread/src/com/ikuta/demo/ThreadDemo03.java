package com.ikuta.demo;

//实现线程的第一种方式的变形:匿名内部类继承Thread类并重写run()方法
public class ThreadDemo03 {
    public static void main(String[] args) {
        Thread thread = new Thread(new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {//运行在分支线程中
                    System.out.println("分支线程--->" + i);
                }
            }
        });
        thread.start();//主线程main调用分支线程thread的start()方法启动分支线程thread

        for (int i = 0; i < 100; i++) {//运行在主线程中
            System.out.println("主线程--->" + i);
        }
    }
}
