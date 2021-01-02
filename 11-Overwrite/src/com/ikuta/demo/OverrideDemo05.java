package com.ikuta.demo;

//方法重写于多态机制的联合使用
public class OverrideDemo05 {
    public static void main(String[] args) {
        Animal05 animal = new Cat05();//多态机制
        animal.doSome();//Cat的doSome方法执行
        //编译阶段调用父类Animal的doSome()方法
        //运行阶段调用子类Cat的doSome()方法
    }
}

class Animal05 {
    public void doSome() {
        System.out.println("Animal的doSome方法执行");
    }
}

class Cat05 extends Animal05 {
    public void doSome() {
        System.out.println("Cat的doSome方法执行");
    }
}