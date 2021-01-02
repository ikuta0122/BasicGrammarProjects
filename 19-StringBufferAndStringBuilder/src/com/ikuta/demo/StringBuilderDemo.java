package com.ikuta.demo;

//体验使用StringBuilder进行字符串的拼接操作
public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(100);
        stringBuilder.append(true);
        stringBuilder.append("hello");
        stringBuilder.append("kitty");
        System.out.println(stringBuilder);
    }
}
