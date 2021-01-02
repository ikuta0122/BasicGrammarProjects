package com.ikuta.demo;

//异常对象的方法getMessage()和printStackTrace()
public class ExceptionDemo08 {
    public static void main(String[] args) {
        NullPointerException e = new NullPointerException("空指针异常");
        System.out.println(e.getMessage());//获取异常简单的描述信息
        e.printStackTrace();// 打印异常追踪的堆栈信息,采用异步线程的方式
    }
}