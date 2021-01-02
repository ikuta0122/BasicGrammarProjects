package com.ikuta.demo;

//关于String类中的构造方法
public class StringDemo03 {
    public static void main(String[] args) {
        String s1 = "HelloWorld";

        byte[] bytes = {97, 98, 99};// 97/98/99--->a/b/c
        String s2 = new String(bytes);

        String s3 = new String(bytes, 1, 2);

        char[] chars = {'西', '野', '七', '濑'};
        String s4 = new String(chars);

        String s5 = new String(chars, 2, 2);
    }
}