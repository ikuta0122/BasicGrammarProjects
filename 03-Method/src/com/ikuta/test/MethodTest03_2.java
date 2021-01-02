package com.ikuta.test;

/*
4.关于递归的作业
使用for循环的方式计算n的阶乘
*/
public class MethodTest03_2 {
	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		int a = s.nextInt();
		//使用for循环的方式计算n的阶乘
		int jieCheng = 1;
		for (;a > 1 ;a-- ){
			jieCheng *= a;
		}
		System.out.println(jieCheng);
	}
}