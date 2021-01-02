package com.ikuta.demo;

//使用super调用父类方法-->super.move()
public class SuperTest07 {
    public static void main(String[] args) {
        MyCat c = new MyCat();
        c.yiDong();
    }
}

class MyAnimal {
    public void move() {
        System.out.println("Animal move!");
    }
}

class MyCat extends MyAnimal {
    public void move() {
        System.out.println("Cat move!");
    }

    public void yiDong() {
        this.move();//Cat move!
        move();//Cat move!
        super.move();//Animal move!
    }
}