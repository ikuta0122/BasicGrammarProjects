package com.ikuta.demo02;

import com.ikuta.demo01.User;

//private修饰的元素只能在本类中访问
//protect的修饰的元素只能在本包,本类及其子类中访问
//没有访问控制权限修饰符的元素只能够在本包中访问
public class AccessControlRightDemo02 {

    public static void main(String[] args) {
        User user = new User();
        // System.out.println(user.id);//报错:'id' has private access in 'com.ikuta.demo01.User'
        // System.out.println(user.age);//报错:'age' has protected access in 'com.ikuta.demo01.User'
        System.out.println(user.weight);
        // System.out.println(user.name);//报错:'name' is not public in 'com.ikuta.demo01.User'. Cannot be accessed from outside package
    }
}
