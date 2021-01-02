package com.ikuta.demo;

//参数传递时,无论是基本数据类型还是引用数据类型都是将后者中保存的“值”[内存地址也是值]复制一份再传递给前者
public class ParameterDemo02 {
    public static void main(String[] args) {
        Person p = new Person();
        //这个p是实例变量,域是person
        p.age = 10;
        add(p);
        System.out.println("main-->" + p.age);//11
    }

    public static void add(Person p) {
        //这个p是实例变量,域是person
        p.age++;
        System.out.println("add-->" + p.age);//11
    }
}

class Person {
    int age;
}