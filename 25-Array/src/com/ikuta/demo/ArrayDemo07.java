package com.ikuta.demo;

//一维数组的存储类型为引用数据类型[引用指向java对象的内存地址]
public class ArrayDemo07 {
    public static void main(String[] args) {
        // 使用多态
        Animal a1 = new Cat();
        Animal a2 = new Dog();
        Animal a3 = new Bird();
        Animal[] animals = {a1, a2, a3};
        //遍历数组，调用move()方法
        for (int i = 0; i < animals.length; i++) {
            animals[i].move();
        }
        //遍历数组，调用子类特有方法
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] instanceof Cat) {
                Cat c = (Cat) animals[i];
                c.catchMouse();
            } else if (animals[i] instanceof Dog) {
                Dog d = (Dog) animals[i];
                d.eatMeet();
            } else if (animals[i] instanceof Bird) {
                Bird b = (Bird) animals[i];
                b.sing();
            }
        }
    }
}

class Animal {
    public void move() {
        System.out.println("Animal Move...");
    }
}

class Cat extends Animal {
    public void move() {
        System.out.println("Cat Move...");
    }

    public void catchMouse() {
        System.out.println("Cat Catch Mouse");
    }
}

class Dog extends Animal {
    public void move() {
        System.out.println("Dog Move...");
    }

    public void eatMeet() {
        System.out.println("Dog Eat Meet");
    }
}

class Bird extends Animal {
    public void move() {
        System.out.println("Bird Move...");
    }

    public void sing() {
        System.out.println("Bird Sing");
    }
}