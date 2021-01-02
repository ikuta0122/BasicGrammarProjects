package com.ikuta.controlstatements.test.test01;

/*
2.从键盘接收一个数字，判断该数字的正负。
*/
public class homework1_2 {
    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.print("请输入数字：");
        double num = s.nextDouble();
        System.out.println("输入数字：" + num);
        System.out.print(num + "是" + (num > 0 ? "正数" : "负数"));
    }
}