package com.ikuta.controlstatements.test.test01;

/*
3.从键盘接收一个数字，判断该数字的奇偶。
*/
public class homework1_3 {
	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("请输入数字：");
		int num = s.nextInt();
		System.out.println("输入数字：" + num);
		System.out.print(num + "是" + ((num%2) == 1 ? "奇数" : "偶数"));
	}
}