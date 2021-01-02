package com.ikuta.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

//异常信息的处理方式:从上往下阅读
public class ExceptionDemo09 {
    public static void main(String[] args) {
        try {
            m1();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("HelloWorld");//异常捕捉允许后续代码继续执行
    }

    private static void m1() throws FileNotFoundException {
        m2();
    }

    private static void m2() throws FileNotFoundException {
        m3();
    }

    private static void m3() throws FileNotFoundException {
        new FileInputStream("src/com/ikuta/config/TestException.txt");
    }
}