package com.ikuta.controlstatements.test.test04;

/*
4.控制台输入年龄，根据不同的年龄输入不同的提示
*/
public class homework4_4 {
    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.println("请输入年龄：");
        int i = s.nextInt();
        if (i >= 0 && i <= 150) {
            System.out.println("您输入的年龄是" + i);
            if (i <= 5) {
                System.out.println("这个人是婴幼儿");
            } else if (i <= 10) {
                System.out.println("这个人是少儿");
            } else if (i <= 18) {
                System.out.println("这个人是少年");
            } else if (i <= 35) {
                System.out.println("这个人是青年");
            } else if (i <= 55) {
                System.out.println("这个人是中年");
            } else {
                System.out.println("这个人是老年");
            }
        } else {
            System.out.println("您输入的年龄不正确");
            System.out.println("输入年龄应当在0到150之间");
        }
    }
}