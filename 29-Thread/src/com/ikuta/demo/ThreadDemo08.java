package com.ikuta.demo;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

//
/*获取线程执行结果
FutureTask对象调用实例方法get()获取线程执行结果
get()方法的执行原理是在当前线程中获取其他线程的执行结果
get()方法导致当前线程进入阻塞状态[线程执行需要一定时间]
 */
public class ThreadDemo08 {
    public static void main(String[] args) {
        FutureTask<String> task = new FutureTask<>(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "执行结果";
            }
        });
        Thread thread = new Thread(task);
        thread.start();
        try {
            System.out.println(task.get().equals("执行结果") ? "成功" : "失败");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
