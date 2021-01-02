package com.ikuta.demo;

/*线程的常用方法
static Thread currentThread()获取当前线程对象
String getName()获取线程对象名称
void setName(String name)修改线程对象名称
 */
public class ThreadDemo09 {
    public static void main(String[] args) {
        Thread currentThread = Thread.currentThread();
        System.out.println("当前线程对象:" + currentThread.getName());
        currentThread.setName("thread");
        System.out.println("当前线程对象:" + currentThread.getName());
    }
}
