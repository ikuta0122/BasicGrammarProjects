package com.ikuta.controlstatements.test.test02;

/*
8.给一个不多于5位的正整数
要求1：判断位数
要求2：逆序打印出各位数字。
*/
public class homework2_8 {
    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.print("输入一个不多于5位的正整数:");
        int num = s.nextInt();
        if (num < 0 || num > 99999) {
            System.out.println("输入信息有误");
            return;
        }
        //要求1：判断位数
        if (num > 0 && num < 10) {
            System.out.println(num + "有1位");
        } else if (num < 100) {
            System.out.println(num + "有2位");
        } else if (num < 1000) {
            System.out.println(num + "有3位");
        } else if (num < 10000) {
            System.out.println(num + "有4位");
        } else {
            System.out.println(num + "有5位");
        }
        //要求2：逆序打印出各位数字。
        int temp;
        while (num != 0) {
            temp = num % 10;
            System.out.println(temp);
            num /= 10;
        }
    }
}