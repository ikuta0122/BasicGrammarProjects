package com.ikuta.demo;

/*当前程序存在的问题（设计上的问题）
鸟在执行move()方法时，最好输出的结果是：鸟在飞
但是当前的程序在执行move()方法时的输出结果是：动物在移动！
很显然Bird子类从Animal父类中继承过来的move()方法已经无法满足子类的业务要求。
*/
public class OverrideDemo01 {
    public static void main(String[] args) {
        Bird01 b = new Bird01();
        b.move();//动物在移动！

        Cat01 c = new Cat01();
        c.move();//动物在移动！
    }
}

//父类
class Animal01 {
    public void move() {
        System.out.println("动物在移动！");
    }
}

//子类
class Bird01 extends Animal01 {
    //希望鸟在移动时，希望输出：鸟在飞
}

//子类
class Cat01 extends Animal01 {
    //希望猫在移动时，希望输出：猫在走猫步
}