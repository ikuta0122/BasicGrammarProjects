package com.ikuta.method.test;

/*
6.通过方法重载，方法重复利用完成以下功能：
	定义方法1：可以返回2个int类型数据中较大的数
	定义方法2：可以返回3个int类型数据中较大的数
	要求使用方法重载，要求体现代码重复利用
	main方法编写程序进行测试
*/
public class MethodTest05 {
	//定义方法1：可以返回2个int类型数据中较大的数
	public static int max(int a, int b){
		return a > b ? a : b;
	}
	//定义方法2：可以返回3个int类型数据中较大的数
	public static int max(int a, int b,int c){
		if (a > b){
			if (a > c){
				return a;
			}else {
				return c;
			}
		}else if (b > c){
			return b;
		}else {
			return c;
		}
	}
	//main方法
	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("输入第一个数字：");
		int x = s.nextInt();
		System.out.print("输入第二个数字：");
		int y = s.nextInt();
		System.out.print("输入第三个数字：");
		int z = s.nextInt();
		System.out.println(max(x,y));
		System.out.println(max(x,y,z));
	}
}