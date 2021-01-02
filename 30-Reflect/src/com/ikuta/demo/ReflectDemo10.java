package com.ikuta.demo;

//通过反射获取类的父类和接口[以String类为例]
public class ReflectDemo10 {
    public static void main(String[] args) {
        try {
            Class stringClass = Class.forName("java.lang.String");
            //情景1:通过反射机制获取类的父类
            String superName = stringClass.getSuperclass().getSimpleName();
            System.out.println("String的父类:" + superName);//String的父类:Object

            //情景2:通过反射机制获取类的接口
            Class[] interfaces = stringClass.getInterfaces();
            for (Class interfaceName : interfaces) {
                System.out.println("String的接口:" + interfaceName.getSimpleName());
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}