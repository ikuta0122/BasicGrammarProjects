package com.ikuta.demo.overload;

/*方法重载（overload）
什么时候需要考虑使用方法重载？
    在同一个类中，如果“功能1”和“功能2”的功能相似，
    那么，可以考虑将他们的方法名一致。（容易记忆）
    注意：方法重载overload不能随意使用，只能在功能相似的情况下使用，不然难以区分。
	
什么时候代码会发生代码重载？、
    条件1：在同一个类当中
    条件2：方法名相同
    条件3：形式参数列表不同（个数、类型、顺序）
    注意:方法重载与返回值类型、修饰符列表无关
*/
public class OverloadDemo03 {
    public static void main(String[] args){
        m1();
        m1(100,100);
        m1(100L,100);
        m1(100,100L);
        //方法1、2、3、4在同一个类中，方法名相同，形参列表不同，发生方法重载
        //方法1和方法2属于参数个数不同
        //方法1和方法3属于参数类型不同
        //方法3和方法4属于参数顺序不同
        m1();
        //方法1和方法5不是同一个类中，不会发生方法重载
    }
    //方法1
    public static void m1(){
        System.out.println("方法1");
    }
    //方法2
    public static void m1(int a,int b){
        System.out.println("方法2");
    }
    //方法3
    public static void m1(long a,int b){
        System.out.println("方法3");
    }
    //方法4
    public static void m1(int a,long b){
        System.out.println("方法4");
    }

	/*
	方法重复,也就是说方法重载与返回值类型无关
	public static int m2(){
		return 1;
	}
	public static double m2(){
		return 1.0;
	}
	*/
	/*
	方法重复,也就是说方法重载与修饰符列表无关
	int m2(){
		return 1;
	}
	public static int m2(){
		return 1.0;
	}
	*/
}

class MyClass{
    //方法5
    public static void m1(){
        System.out.println("方法5");
    }
}