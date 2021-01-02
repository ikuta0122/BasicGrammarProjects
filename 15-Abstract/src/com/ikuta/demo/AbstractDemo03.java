package com.ikuta.demo;

//面向抽象编程
public class AbstractDemo03 {
    public static void main(String[] args) {
        //面向抽象编程:能否使用多态机制/能否父类引用指向子类对象?--->可以
        //面向抽象编程的优点:降低程序耦合度,提高程序扩展力,符合OCP原则
        Animal a = new Bird2();
        a.move();
    }
}

//抽象类
abstract class Animal {
    //抽象方法
    public abstract void move();
}

//如果抽象类的子类为抽象类,那么无需实现抽象方法
abstract class Bird1 extends Animal {
}

//如果抽象类的子类为非抽象类,那么需要实现抽象方法
class Bird2 extends Animal {
    public void move() {
        System.out.println("fly~~~~");
    }
}