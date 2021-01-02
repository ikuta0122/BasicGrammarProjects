package com.ikuta.demo;

//继承与实现:先继承后实现
public class InterfaceDemo04 {
    public static void main(String[] args) {
        Flyable f1 = new Cat();
        f1.fly();//猫：芜湖，起飞~~~
    }
}

//父类：动物类
class Animal {
}

//接口:可飞翔的接口[接口通过提取的是行为动作]
interface Flyable {
    void fly();
}

//子类：猫类[先继承后实现]
class Cat extends Animal implements Flyable {
    public void fly() {
        System.out.println("猫：芜湖，起飞~~~");
    }
}

