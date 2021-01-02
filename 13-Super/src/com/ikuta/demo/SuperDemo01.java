package com.ikuta.demo;

//测试super()和this()
public class SuperDemo01 {
    public static void main(String[] args) {
        new Cat();//创建B对象
    }
}

class Animal {
    public Animal() {
        System.out.println("父类的无参数构造方法");
    }

    public Animal(int i) {
        System.out.println("父类的有参数构造方法(int)");
    }
}

class Cat extends Animal {
    public Cat() {
        super();//构造器首行默认有super();表示调用父类的无参构造器进行实例化对象
        //super(100);//super(100);表示调用父类的有参构造器
        //this("张三");//表示调用自身的有参构造器
        System.out.println("子类的无参数构造方法");
    }

    public Cat(String name) {
        System.out.println("子类的有参数构造方法(String)");
    }
}
/*
情景：A类中只有一个有参数构造方法(int),而B类中为super();
class A{
	public A(int i){
		System.out.println("A类的有参数构造方法(int)");
	}
}
class B extends A{
	public B(){
		super();
		System.out.println("B类的无参数构造方法");
	}
}
错误: 无法将类 A中的构造器 A应用到给定类型;
需要: int
找到:    没有参数
解决方法：
	1.super()的()给一个int类型的数据;
	2.类 A中的构造器 A改为无参数构造方法
*/