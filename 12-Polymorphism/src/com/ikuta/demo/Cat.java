package com.ikuta.demo;

//子类：猫类
public class Cat extends Animal {
    public void move() {
        System.out.println("猫走猫步");
    }

    public void catchMouse() {
        System.out.println("猫抓老鼠");
    }
}