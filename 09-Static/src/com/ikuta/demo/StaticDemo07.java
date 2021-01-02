package com.ikuta.demo;

/*
栈：方法只要执行，就会压栈（局部变量）
堆：new出来的对象都在堆中（实例变量）。垃圾回收器主要针对堆。
方法区：类的信息、字节码信息、代码片段（静态变量）
*/
/*
总结：
第一：方法体中的代码是有先后顺序的。
第二：静态代码块1和静态代码块2是有先后顺序的。
第三：静态代码块和静态变量是有先后顺序的。
*/
// 方法的代码片段放在方法区，但是方法执行过程当中需要的内存在栈中。
public class StaticDemo07 {
    //静态变量在什么时候初始化？类加载时初始化
    //静态变量存储在哪里？方法区
    static int i = 100;

    //静态代码块什么时候执行？类加载时执行
    static {
        //静态代码块中可以访问静态变量吗?可以
        System.out.println("i=" + i);
    }

    /*静态变量在静态代码块下面的情况
	static{
		//这里可以访问name吗？
		System.out.println("name" + name);
	}
	static String name = "zhangsan";
	//错误: 非法前向引用
	//静态变量和静态代码块都在类加载时执行。
	//时间相同,只能靠代码顺序来确定谁先谁后。
	*/

    //入口
    public static void main(String[] args) {
        System.out.println(i);
    }
}
