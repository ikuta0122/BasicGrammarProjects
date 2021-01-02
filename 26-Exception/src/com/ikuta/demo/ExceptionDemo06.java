package com.ikuta.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

//异常捕捉允许后续代码继续执行
public class ExceptionDemo06 {
    public static void main(String[] args) {
        System.out.println("main begin");
        try {
            m1();
            System.out.println("异常没有发生");
        } catch (Exception e) {
            System.out.println("异常发生");
        }
        System.out.println("main over");
    }

    private static void m1() throws Exception {
        System.out.println("m1 begin");
        m2();
        System.out.println("m1 over");
    }

    private static void m2() throws ClassCastException, FileNotFoundException {
        System.out.println("m2 begin");
        m3();
        System.out.println("m2 over");
    }

    /**
     * @throws FileNotFoundException 编译时异常
     */
    private static void m3() throws FileNotFoundException {
        // new FileInputStream("src/com/ikuta/config/TestException.txt");//正确的相对路径
        new FileInputStream("com/ikuta/config/TestException.txt");//错误的相对路径
        System.out.println("异常没有发生");
    }
}