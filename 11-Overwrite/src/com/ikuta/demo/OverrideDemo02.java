package com.ikuta.demo;

//什么时候考虑使用方法重写[子类从父类继承过来的方法无法满足子类的业务要求时]
public class OverrideDemo02 {
    public static void main(String[] args) {
        Bird02 b = new Bird02();
        b.move();//鸟在飞！
        b.sing(8);//动物在唱歌！方法重载
        b.sing();//鸟在唱歌！方法重写

        Cat01 c = new Cat01();
        c.move();//猫在走猫步！
    }
}

//父类
class Animal02 {
    //方法：移动
    public void move() {
        System.out.println("动物在移动！");
    }
	/*
	protected void move(){
		System.out.println("动物在移动！");
	}
	可以通过，说明：访问权限不能更低，可以更高
	*/
	/*
	public void move() throws Exception{
		System.out.println("动物在移动！");
	}
	可以通过，说明：抛出异常不能更多，可以更少
	*/

    public void sing(int i) {
        System.out.println("动物在唱歌！");
    }
}

//子类
class Bird02 extends Animal02 {
    public void move() {
        System.out.println("鸟在飞！");
    }
	
	/*protected表示受保护的，没有public开发
	protected void move(){
		System.out.println("鸟在飞！");
	}
	错误：Bird中的move()无法覆盖Animal中的move()
	正在尝试分配更低的访问权限; 以前为public
	*/
	/*
	public void move() throws Exception{
		System.out.println("鸟在飞！");
	}
	错误：Bird中的move()无法覆盖Animal中的move()
	被覆盖的方法未抛出Exception
	*/

    //分析：这个sing方法是否构成方法覆盖？
    //不构成，形式参数列表不同
    public void sing() {
        System.out.println("鸟在唱歌！");
    }
}


class Cat02 extends Animal02 {
    public void move() {
        System.out.println("猫在走猫步！");
    }
}