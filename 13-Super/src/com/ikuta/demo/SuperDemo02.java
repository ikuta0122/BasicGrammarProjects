package com.ikuta.demo;

//判断以下程序的执行结果
public class SuperDemo02 {
    public static void main(String[] args) {
        new C();
    }
}

class A {
    public A() {
        System.out.println("A类的无参数构造方法");
    }
}

class B extends A {
    public B() {
        System.out.println("B类的无参数构造方法");
    }

    public B(String name) {
        System.out.println("B类的有参数构造方法(String)");
    }
}

class C extends B {
    public C() {
        this("张三");
        System.out.println("C类的无参数构造方法");
    }

    public C(String name) {
        this(name, 20);
        System.out.println("C类的有参数构造方法(String)");
    }

    public C(String name, int age) {
        super(name);
        System.out.println("C类的有参数构造方法(String,int)");
    }
}