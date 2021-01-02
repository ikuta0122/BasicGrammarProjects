package com.ikuta.demo;

//情景:final修饰的实例变量--->final修饰的实例变量也是变量，而变量只能赋值一次
//结论:final修饰的实例变量,系统不会赋默认值,要求手动赋值[声明变量时/构造方法中]
public class FinalDemo03 {
    public static void main(String[] args) {
        User u1 = new User();
        System.out.println(u1.height);
        System.out.println(u1.weight);
    }
}

class User {
    // final int height;//报错:Variable 'height' might not have been initialized
    final double height = 1.8;//final修饰的实例变量在声明变量时手动赋值
    final double weight;//final修饰的实例变量在构造方法中手动赋值

    public User() {
        this(80);
    }

    public User(double weight) {
        super();
        this.weight = weight;
    }
}