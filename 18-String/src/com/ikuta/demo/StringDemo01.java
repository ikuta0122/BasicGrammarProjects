package com.ikuta.demo;

//创建String对象的多种方式
public class StringDemo01 {
    public static void main(String[] args) {
        //第一种方式:直接创建字符串对象
        String s1 = "abc";//底层创建字符串对象"abc"存储于字符串常量池中
        String s2 = "abc" + "xy";//底层创建字符串对象"xy"和"abcxy"存储于字符串常量池中

        //第二种方式:使用new方式创建字符串对象
        //引用指向堆内存的String对象
        //String对象指向字符串常量池中的字符串对象"xy"
        String s3 = new String("xy");
    }
}
