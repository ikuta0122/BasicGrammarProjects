package com.ikuta.demo.method;

public class MethodDemo07 {
    public static void main(String[] args) {
        int s1 = MethodDemo07.m();
        System.out.println(s1);//1,写死了
        int s2 = MethodDemo07.m(true);
        System.out.println(s2);//1,由实参决定
        int s3 = MethodDemo07.m(false);
        System.out.println(s3);//0,由实参决定
    }

    public static int m() {
        boolean flag = true;
        return flag ? 1 : 0;
    }

    public static int m(boolean flag) {
        return flag ? 1 : 0;
    }
}