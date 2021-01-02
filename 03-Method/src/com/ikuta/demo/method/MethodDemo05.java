package com.ikuta.demo.method;

//任何一个方法体当中的代码都是遵循自上而下的顺序依次逐行执行的
public class MethodDemo05 {
    public static void main(String[] args) {
        System.out.println("main begin");
        m1();//调用m1方法
        System.out.println("main over");
    }

    public static void m1() {
        System.out.println("m1 begin");
        m2();//在m1方法中调用m2()方法、
        System.out.println("m1 over");
    }

    public static void m2() {
        System.out.println("m2 begin");
        T.m3();//在m2方法中调用T类的m3()方法
        System.out.println("m2 over");
    }
}

class T {
    public static void m3() {
        System.out.println("m3 begin");
        System.out.println("T's m3 method execute!");
        System.out.println("m3 over");
    }
}