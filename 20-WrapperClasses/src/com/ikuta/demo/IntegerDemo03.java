package com.ikuta.demo;

//包装类的构造方法
public class IntegerDemo03 {
    public static void main(String[] args) {
        Integer x = new Integer(100);
        Integer y = new Integer("100");
        System.out.println(x.equals(y));//true
    }
}