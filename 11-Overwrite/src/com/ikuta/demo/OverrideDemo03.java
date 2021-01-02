package com.ikuta.demo;

//方法覆盖经典案例
public class OverrideDemo03 {
    public static void main(String[] args) {
        Chinese c = new Chinese("张三");
        c.speak();//张三说汉语
        American a = new American("Jack");
        a.speak();//Jack说英语
    }
}

class People {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public People() {
    }

    public People(String name) {
        this.name = name;
    }

    public void speak() {
        System.out.println(name + "说话");
    }
}

class Chinese extends People {
    public Chinese() {
    }

    public Chinese(String name) {
        super(name);
    }

    public void speak() {
        System.out.println(this.getName() + "说汉语");
    }
}

class American extends People {
    public American() {
    }

    public American(String name) {
        super(name);
    }

    public void speak() {
        System.out.println(this.getName() + "说英语");
    }
}