package com.ikuta.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

//深入try...catch...语句块
public class ExceptionDemo07 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("src/com/ikuta/config/TestException.txt");//创建输入流对象
            System.out.println(100 / 0);//进行数学运算
        } catch (FileNotFoundException e) {
            System.out.println("文件不存在");
        } catch (ArithmeticException e) {
            System.out.println("数学运算失败");
        }
        System.out.println("try...catch语句的后续代码可以执行");
    }
}