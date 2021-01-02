package com.ikuta.demo;


//没有使用异常机制
public class ExceptionDemo01 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        if (b == 0) {//安全性检验,避免出现ArithmeticException: / by zero
            System.out.println("除数不能为0");
            return;
        }
        int c = a / b;
        System.out.println(a + "/" + b + "=" + c);
    }
}