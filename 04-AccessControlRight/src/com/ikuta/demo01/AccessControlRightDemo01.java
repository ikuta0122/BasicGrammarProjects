package com.ikuta.demo01;

//private修饰的元素只能在本类中访问
public class AccessControlRightDemo01 {
    public static void main(String[] args) {
        User user = new User();
        // System.out.println(user.id);//报错:'id' has private access in 'com.ikuta.demo01.User'
        System.out.println(user.age);
        System.out.println(user.weight);
        System.out.println(user.name);
    }
}
