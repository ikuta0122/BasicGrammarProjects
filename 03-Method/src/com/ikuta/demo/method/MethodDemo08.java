package com.ikuta.demo.method;

//局部变量只在方法体中有效,方法结束后释放内存
public class MethodDemo08 {
    public static void main(String[] args) {
		/*
		int	a = 100;
		int b = a;
		这个复制原理是：将a变量中保存的100这个数字复制一份传给b变量
		所以a和b是两个不同的内存空间，是两个局部变量
		*/

        System.out.println("main begin");
        int x = 100;
        m1(x);
        System.out.println("main over");
    }

    public static void m1(int i) {
        System.out.println("m1 begin");
        m2(i);
        System.out.println("m1 over");
    }

    public static void m2(int i) {
        System.out.println("m2 begin");
        m3(i);
        System.out.println("m2 over");
    }

    public static void m3(int i) {
        System.out.println("m3 begin");
        System.out.println(i);
        System.out.println("m3 over");
    }
}