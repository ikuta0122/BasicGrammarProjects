package com.ikuta.demo;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

//实现线程的第三种方式的变形:匿名内部类实现Callable接口并实现call()方法
public class ThreadDemo07 {
    public static void main(String[] args) {
        Thread thread = new Thread(new FutureTask<Integer>(new Callable<Integer>() {
            /**
             * @return 线程执行结果返回值
             * @throws Exception
             */
            @Override
            public Integer call() throws Exception {
                for (int i = 0; i < 100; i++) {//运行在分支线程中
                    System.out.println("分支线程--->" + i);
                }
				return null;
			}
        }));
        thread.start();//主线程main调用分支线程thread的start()方法启动分支线程thread

        for (int i = 0; i < 100; i++) {//运行在主线程中
            System.out.println("主线程--->" + i);
        }
    }
}