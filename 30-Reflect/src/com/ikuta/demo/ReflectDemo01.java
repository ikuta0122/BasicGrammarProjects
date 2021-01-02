package com.ikuta.demo;

//获取Class实例的三种方式
public class ReflectDemo01 {
    public static void main(String[] args) {
        try {
            Class class1 = Class.forName("java.lang.String");
            Class class2 = "HelloWorld".getClass();
            Class class3 = String.class;
            boolean result = class1 == class2 && class1 == class3 ? true : false;
            System.out.println(result ? "字节码文件只能在JVM中加载一次" : "字节码文件可以在JVM中加载多次");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}