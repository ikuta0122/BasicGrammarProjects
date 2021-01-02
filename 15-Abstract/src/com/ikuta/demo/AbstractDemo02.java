package com.ikuta.demo;

//非抽象子类实现父类的抽象方法
public class AbstractDemo02 {
    public static void main(String[] args) {
        A a = new B();
        a.doSome();
    }
}

abstract class A {
    public abstract void doSome();
}

class B extends A {
    @Override
    public void doSome() {
        System.out.println("子类继承抽象类,重写抽象方法");
    }
}