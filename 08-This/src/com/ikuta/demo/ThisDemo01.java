package com.ikuta.demo;

public class ThisDemo01 {
    public static void main(String[] args) {
        Customer c1 = new Customer("张三");
        c1.shopping();
        Customer c2 = new Customer("李四");
        c2.shopping();
        User.m1();
    }
}

//顾客类
class Customer {
    String name;

    public Customer() {

    }

    public Customer(String s) {
        name = s;
    }

    //顾客购物方法
    public void shopping() {
        //此处的this是谁？this是当前对象
        //c1调用shopping(),this是c1
        //c2调用shopping(),this是c2
        //this.是可以省略的，还是默认访问“当前对象”
        System.out.println(this.name + "正在购物");
    }

}

//学生类
class Student {
    String name = "zhangsan";

    public static void m1() {
        //此处能访问name吗?--->不能
        //要素1:name是实例变量,必须先new对象然后通过“引用.”访问
        //要素2:m1是静态方法而静态方法调用不需要对象
        //System.out.println(name);实际上是System.out.println(this.name);
        //this代表“当前对象”，不能出现在静态方法中

        //修改为：
        User s = new User();
        System.out.println(s.name);
    }
}
