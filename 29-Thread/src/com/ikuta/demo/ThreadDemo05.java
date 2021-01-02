package com.ikuta.demo;

//实现线程的第二种方式的变形:匿名内部类实现Runnable接口并实现run()方法
public class ThreadDemo05 {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("分支线程--->" + i);
                }
            }
        });
        thread.start();

        for (int i = 0; i < 100; i++) {
            System.out.println("主线程--->" + i);
        }
    }
}