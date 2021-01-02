package com.ikuta.demo;

/*
结论1:外部程序可以随意对类Person的属性name进行操作,导致了程序不安全
结论2:外部程序对类Person的属性age进行操作时需要经过检验,保证了程序的安全性
*/
public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person("小明", 18);
        //获取实例person的属性name
        System.out.println(person.name);//小明
        //修改实例person的属性name
        person.name = "小红";
        System.out.println(person.name);//小红

        //获取实例person的属性age
        System.out.println(person.getAge());//18
        //修改实例person的属性age
        person.setAge(-50);//年龄值在0到150,请重新赋值
        System.out.println(person.getAge());//18

    }
}
