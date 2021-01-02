package com.ikuta.test;

/*
1.编写一个方法,求整数n的阶乘
思考:
1.这个方法应该起什么名字?
	jieCheng
2.这个方法的形参是什么?
	int x
3.方法的返回值类型是什么?
	int
*/
public class MethodTest01 {
	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("输入数字:");
		int i = s.nextInt();
		int n = jieCheng(i);
		System.out.print(n);
	}

	public static int jieCheng(int x){
		int temp = 1;
		for (; x > 1; x--){
			temp *= x;
		}
		return temp;
	}
}