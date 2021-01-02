package com.ikuta.controlstatements.test.test02;

/*
3.从控制台输入一个正整数，计算该数的阶乘。
*/
public class homework2_3 {
    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.print("输入一个正整数");
        int i = s.nextInt();
        int temp = i;
        if (i < 0) {
            System.out.println("输入信息有误");
            return;
        }
        int jieCheng = 1;
        while (i > 1) {
            jieCheng *= i;
            i--;
        }
        System.out.println(temp + "的阶乘是" + jieCheng);
    }
}