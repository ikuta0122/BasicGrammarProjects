package com.ikuta.demo;

//静态方法和实例方法的调用
public class StaticDemo04 {
    public static void main(String[] args) {
        StaticDemo04.doSome();//静态方法doSome()执行了!

        StaticDemo04 s4 = new StaticDemo04();
        s4.doOther();//实例方法doOther()执行了!

        //不建议使用"引用."访问静态方法
        s4.doSome();//相当于StaticTest04.doSome();
        //静态方法doSome()执行了!
    }

    //静态方法的调用采用"类名."
    public static void doSome() {
        System.out.println("静态方法doSome()执行了!");
    }

    //实例方法的调用需要先new对象然后使用采用"引用."
    public void doOther() {
        System.out.println("实例方法doOther()执行了!");
    }
}