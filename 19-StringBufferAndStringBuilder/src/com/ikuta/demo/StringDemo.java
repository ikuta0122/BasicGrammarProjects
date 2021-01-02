package com.ikuta.demo;

//思考:字符串一旦创建不可变带来的后果
//结论:每一个字符串拼接都会产生新字符串,占用大量的方法区内存,造成内存空间浪费
public class StringDemo {
    public static void main(String[] args) {
        String s = "";
        for (int i = 0; i < 100; i++) {
            System.out.println(s += i);
        }
        // 以上的方法会被方法区的字符串常量池带来很大的压力
    }
}