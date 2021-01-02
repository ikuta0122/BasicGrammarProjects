package com.ikuta.demo;

//位运算符
public class OperatorDemo07 {
    public static void main(String[] args) {
        System.out.println(10 >> 1);//5
        // 10的二进制位:0000 1010		[10]
        // 10的二进制右移1位:0000 0101	[5]

        System.out.println(10 << 1);//20
        // 10的二进制位:0000 1010		[10]
        // 10的二进制左移1位:0001 0100	[20]
    }
}