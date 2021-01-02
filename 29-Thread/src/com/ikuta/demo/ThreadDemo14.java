package com.ikuta.demo;

/**
 * 线程的调度问题:线程优先级 + 读写当前线程优先级
 */
public class ThreadDemo14 {
    public static void main(String[] args) {
        System.out.println("默认优先级:" + Thread.NORM_PRIORITY);// 默认优先级:5
        System.out.println("最低优先级:" + Thread.MIN_PRIORITY);// 最低优先级:1
        System.out.println("最高优先级:" + Thread.MAX_PRIORITY);// 最高优先级:10

        System.out.println("当前线程优先级：" + Thread.currentThread().getPriority());// 当前线程优先级：5
        Thread.currentThread().setPriority(7);
        System.out.println("当前线程优先级：" + Thread.currentThread().getPriority());// 当前线程优先级：7
    }
}