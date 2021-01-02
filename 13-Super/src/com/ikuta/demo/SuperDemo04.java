package com.ikuta.demo;

//如何理解关键字super
public class SuperDemo04 {
    public static void main(String[] args) {
        Vip vip = new Vip("张三");
        vip.shopping();
    }
}

class Customer {
    String name;

    public Customer() {
    }

    public Customer(String name) {
        this.name = name;
    }
}

class Vip extends Customer {
    public Vip() {
    }

    public Vip(String name) {
        super(name);
    }

    public void shopping() {
        System.out.println(this.name + "正在购物");//this表示当前对象
        System.out.println(name + "正在购物");//this.可以省略
        System.out.println(super.name + "正在购物");//super表示当前对象的父类型特征
    }
}