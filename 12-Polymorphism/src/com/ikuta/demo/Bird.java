package com.ikuta.demo;

//子类：鸟类
public class Bird extends Animal {
    public void move() {
        System.out.println("鸟在飞翔");
    }

    public void sing() {
        System.out.println("鸟在唱歌");
    }
}