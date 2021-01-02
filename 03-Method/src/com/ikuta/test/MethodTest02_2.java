package com.ikuta.test;

/*
2.编写一个方法，输出大于某个正整数n的最小的质数（素数）
*/
/*
思路：可以定义两个方法
第一个方法：判断是否为质数
第二个方法：打印第一个质数
*/
public class MethodTest02_2 {
	//定义方法1：判断是否为质数
	public static boolean ifZhishu(int b){
		for (int j = 2; j < b; j++){
			if (b % j == 0){
				return false;
			}
		}
		return true;
	}

	//定义方法2：打印第一个质数
	public static void outZhishu(int a){
		for (a += 1; ; a++){
			if ( ifZhishu(a) == true){
				System.out.println("质数:" + a);
				return ;
			}
		}
	}

	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("输入数字:");
		int i = s.nextInt();
		outZhishu(i);
	}
}