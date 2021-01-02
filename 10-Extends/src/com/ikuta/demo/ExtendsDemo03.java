package com.ikuta.demo;

//测试:子类继承父类之后，能使用子类对象调用父类方法吗？
/*可以
子类继承父类之后将父类继承过来的方法归为自己所有
本质上,子类调用的不是父类方法而是子类自己的方法
*/
public class ExtendsDemo03 {
    public static void main(String[] args) {
        Cat c = new Cat("小花");
        //子类调用父类方法
        c.move();
        //子类访问父类属性
        System.out.println(c.name);
    }
}

//父类
class Animal {
    String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    //提供有一个动物移动的方法
    public void move() {
        System.out.println(name + "正在移动");
    }
}

//子类
class Cat extends Animal {
    public Cat() {
    }

    public Cat(String name) {
        super(name);
    }
}