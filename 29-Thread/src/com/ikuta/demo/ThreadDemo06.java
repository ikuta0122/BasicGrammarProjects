package com.ikuta.demo;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

//实现线程的第三种方式:匿名内部类实现Callable接口并实现call()方法
class DemoThread06 implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        for (int i = 0; i < 100; i++) {//运行在分支线程中
            System.out.println("分支线程--->" + i);
        }
        return null;
    }
}

public class ThreadDemo06 {
    public static void main(String[] args) {
        Thread thread = new Thread(new FutureTask<Integer>(new DemoThread06()));
        thread.start();
        for (int i = 0; i < 100; i++) {//运行在主线程中
            System.out.println("主线程--->" + i);
        }
    }
}
