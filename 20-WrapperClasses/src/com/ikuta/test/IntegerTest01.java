package com.ikuta.test;

//面试题:分析以下程序的输出结果为什么会不同?--->整数型常量池
public class IntegerTest01 {
    public static void main(String[] args) {
        Integer a = 128;
        Integer b = 128;
        System.out.println(a == b);// false

        Integer x = 127;
        Integer y = 127;
        System.out.println(x == y);// true
    }
}