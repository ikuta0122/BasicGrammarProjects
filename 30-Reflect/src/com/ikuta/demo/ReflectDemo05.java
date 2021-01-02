package com.ikuta.demo;

import java.util.ResourceBundle;

//关于资源绑定器
public class ReflectDemo05 {
    public static void main(String[] args) {
        ResourceBundle bundle = ResourceBundle.getBundle("com/ikuta/config/classinfo");
        String className1 = bundle.getString("className1");
        System.out.println(className1);
    }
}