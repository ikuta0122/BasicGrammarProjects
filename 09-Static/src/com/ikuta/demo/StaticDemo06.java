package com.ikuta.demo;

//静态代码块
/*
1.使用static关键字可以定义：静态代码块
2.什么是静态代码块？语法机制是什么？
static{
	java语句；
	java语句；
}
3.静态代码块在类加载时执行，并且只执行一次。
4.静态代码块在main方法执行之前执行。
5.静态代码块一般是按照自上而下的顺序执行。
6.静态代码块有什么用？
	第一：静态代码块不是那么常用（不是每一个类中都要写的）。
	第二：静态代码块这种语法机制实际上是sun公司给java程序员的一个特殊的时刻/时机。
		  这个时机叫做：类加载时机。
		  具体业务要求：记录类加载的日志信息。
*/
public class StaticDemo06 {
    //静态代码块（特殊的时机：类加载时机）
    static {
        System.out.println("A");
    }

    //一个类中可以编写多个静态代码块
    static {
        System.out.println("B");
    }

    //入口
    public static void main(String[] args) {
        System.out.println("HelloWord！！！");
    }

    //编写另一个静态代码块
    static {
        System.out.println("C");
    }
}