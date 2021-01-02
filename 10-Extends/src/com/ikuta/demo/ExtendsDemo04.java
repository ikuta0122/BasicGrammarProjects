package com.ikuta.demo;

/*
所有类默认继承Object类
toString()方法是Object类的一个实例方法,需要实例化对象才能使用
如果直接输出一个"引用",println()方法会自动调用"引用.toString()"
如果类没有重写toString()方法,那么直接输出一个"引用"会得到一段哈希算法的16进制字符串
哈希算法的16进制字符串是指该对象在堆内存当中的内存地址
*/
//测试toString()方法
public class ExtendsDemo04 {
    public static void main(String[] args) {
        MyClass01 myClass01 = new MyClass01();
        MyClass02 myClass02 = new MyClass02();
        System.out.println(myClass01);//重写toString()方法
        System.out.println(myClass02);//com.ikuta.demo.MyClass02@61bbe9ba
    }
}

//重写toString()方法
class MyClass01 {
    @Override
    public String toString() {
        return "重写toString()方法";
    }
}

//没有重写toString()方法
class MyClass02 {
}
