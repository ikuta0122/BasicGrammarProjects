package com.ikuta.demo;

/*
1.除了静态代码块之外，还有一种语句块叫做：实例语块
2.实例语块在类加载时并没有执行
3.实例语块的语法机制
	{
		java语句；
		java语句；
		java语句；
	}
4.实例语块在构造方法执行之前时执行
	实际上是sun公司给java程序员的一个特殊的时刻/时机。
	这个时机叫做：对象构建时机。

5.可以把构造方法之间的公共代码放到实例语块中
*/
public class InstanceCodeDemo {
    public static void main(String[] args) {
        InstanceCodeDemo o1 = new InstanceCodeDemo();
        InstanceCodeDemo o2 = new InstanceCodeDemo("abc");
    }

    //实例语块
    {
        System.out.println("实例语块执行！");
    }

    public InstanceCodeDemo() {
        System.out.println("无参数构造方法");
    }

    public InstanceCodeDemo(String name) {
        System.out.println("有参数构造方法");
    }
}
