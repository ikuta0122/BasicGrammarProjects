package com.ikuta.demo;

// 基本数据类型使用“==”判断,引用数据类型使用“equals”判断
// String类已经重写了equals()方法和toString()方法
public class ObjectDemo05 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";
        System.out.println(s1 == s2);//false
        System.out.println(s1.equals(s2));//true
        System.out.println(s1);//Hello
    }
}