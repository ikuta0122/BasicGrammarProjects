package com.ikuta.demo;

//情景:final修饰的"引用"--->引用也属于变量，final修饰的变量只能赋一次值
//结论:final修饰的"引用"只能指向一个对象,并且永远只能指向该对象[该对象在方法执行结束后被垃圾回收器回收]
//注意:final修饰的"引用"指向的对象的数据是可以修改的,修改对象中数据不会改变内存地址
public class FinalDemo02 {
    public static void main(String[] args) {
        final Person person;
        Person person1 = new Person(10);
        Person person2 = new Person(20);
        person = person1;
        //person = person2;//报错:Variable 'person' might already have been assigned to
        //结论:final修饰的"引用"只能指向一个对象,并且永远只能指向该对象

        person.age = 80;
        //结论:final修饰的"引用"指向的对象的数据是可以修改的,修改对象中数据不会改变内存地址
    }
}

class Person {
    int age;

    public Person() {
        super();
    }

    public Person(int age) {
        super();
        this.age = age;
    }
}