package com.ikuta.test.test03;

/*
1.从键盘上接收一个5位数,判断是不是回文数
*/
public class homework3_1 {
    public static void main(String[] args) {
        //创建一个键盘扫描器
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.print("输入一个5位数:");
        int num = s.nextInt();

        //判断是否为5位数
        if (num < 10000 || num > 99999) {
            System.out.println("输入信息有误");
            return;//结束main方法
        }

        //取位数对比
        if (num / 10000 == num % 10) {
            if (num % 10000 / 1000 == num % 100 / 10) {
                System.out.println(num + "是回文数");
            } else {
                System.out.println(num + "不是回文数");
            }
        } else {
            System.out.println(num + "不是回文数");
        }
    }
}