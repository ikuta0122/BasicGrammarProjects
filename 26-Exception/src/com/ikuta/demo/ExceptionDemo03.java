package com.ikuta.demo;

//异常的第一种处理方式:异常上抛
public class ExceptionDemo03 {
    public static void main(String[] args) {
        System.out.println(100 / 0);
        // 第一步:100 / 0发生ArithmeticException异常
        // 第二步:底层new了一个ArithmeticException异常对象,然后抛出
        // 第三步:ArithmeticException异常对象抛给了main方法[因为是main方法调用了100 / 0,异常上抛给调用者]
        // 第四步:ArithmeticException异常对象抛给了JVM[因为main方法没有处理,异常继续上抛]
        // 第五步:JVM终止程序的执行
        System.out.println("HelloWorld");//HelloWorld没有输出,说明JVM抛出异常会终止执行程序
    }
}