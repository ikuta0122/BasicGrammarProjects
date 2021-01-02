package com.ikuta.demo;

//通过构造方法进行对象的属性初始化
public class ConstructorDemo02 {
    public static void main(String[] args) {
        User u1 = new User();
        System.out.println(u1.id);//0
        System.out.println(u1.name);//noName
        System.out.println(u1.age);//0

        User u2 = new User(1, "zhangsan", 10);
        System.out.println(u2.id);//1
        System.out.println(u2.name);//zhangsan
        System.out.println(u2.age);//10
    }
}

class User {
    int id;
    String name;
    int age;

    public User() {
        this(0, "noName", 0);
    }

    public User(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}