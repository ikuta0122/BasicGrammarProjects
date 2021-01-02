package com.ikuta.demo;

//实现线程的第二种方式:实现Runnable接口并实现run()方法
class DemoThread04 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {//运行在分支线程中
            System.out.println("分支线程--->" + i);
        }
    }
}

public class ThreadDemo04 {
    public static void main(String[] args) {
        Thread thread = new Thread(new DemoThread04());//创建分支线程对象
        thread.start();//主线程main调用分支线程thread的start()方法启动分支线程thread

        for (int i = 0; i < 100; i++) {//运行在主线程中
            System.out.println("主线程--->" + i);
        }
    }
}
