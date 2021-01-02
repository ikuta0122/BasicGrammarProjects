package com.ikuta.demo;

//测试1:this和super的区别
//测试2:super的省略问题
public class SuperDemo05 {
    public static void main(String[] args) {
        MyVip vip = new MyVip("张三");
        vip.shopping();
    }
}

class MyCustomer {
    String name;

    public MyCustomer() {
    }

    public MyCustomer(String name) {
        this.name = name;
    }
}

class MyVip extends MyCustomer {
    String name;//JAVA允许子类和父类出现同名变量

    public MyVip() {
    }

    public MyVip(String name) {
        super(name);//调用父类的带参构造器
        this.name = "李四";
    }

    public void shopping() {
        System.out.println(this.name + "正在购物");//李四正在购物
        System.out.println(name + "正在购物");//李四正在购物
        System.out.println(super.name + "正在购物");//张三正在购物
    }
}