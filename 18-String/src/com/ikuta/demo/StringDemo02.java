package com.ikuta.demo;

//判断两个String对象是否相等应该使用equals()方法
public class StringDemo02 {
    public static void main(String[] args) {
        //情景1:如果两个字符串对象都是直接创建的,且两者的值相同,那么两者的内存地址相同
        String s1 = "Hello";
        String s2 = "Hello";
        System.out.println(s1 == s2);//true

        //情景2:如果两个字符串对象都是new创建的,即使两者的值相同,两者的内存地址也不相同
        String x = new String("xyz");
        String y = new String("xyz");
        System.out.println(x == y);//false
    }
}