package com.ikuta.demo;

class User {
    public User() {
        super();
    }
}

//关于class.newInstance()方法
public class ReflectDemo02 {
    public static void main(String[] args) {
        try {
            Class userClass = Class.forName("com.ikuta.demo.User");
            Object obj = userClass.newInstance();//底层调用无参构造器完成对象的创建
            System.out.println(obj);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}