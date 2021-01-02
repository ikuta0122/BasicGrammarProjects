package com.ikuta.demo02;

import com.ikuta.demo01.User;

//protected修饰的元素只能够在本包,本类及其子类中访问
public class Vip extends User {
    @Override
    public void doSome() {
        // System.out.println(this.id);//报错:'id' has private access in 'com.ikuta.demo01.User'
        System.out.println(this.age);
        System.out.println(this.weight);
        // System.out.println(this.name);//报错:'name' is not public in 'com.ikuta.demo01.User'. Cannot be accessed from outside package
    }
}