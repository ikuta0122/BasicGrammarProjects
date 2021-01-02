package com.ikuta.test;

/*
2.编写一个方法，输出大于某个正整数n的最小的质数（素数）
思考：
1.这个方法应该起什么名字?
	minZhishu
2.这个方法的形参是什么?
	int x
3.方法的返回值类型是什么?
	void
*/
/*思路：
第一步：从n+1找质数
第二步：每加1得到的数判断一下是否为质数
第三步：找到一个质数就终止循环
*/
public class MethodTest02_1 {
	//定义方法：从n+1开始依次判断后面的数是不是质数，并且输出第一个质数
	public static void minZhishu(int x){
		//从n+1找质数
		for (x += 1; ; x++){
			//判断是否为质数
			//如果2到x-1之间有数能整除x，那么flag为false，反之为true
			//当找到数整除x，flag变为false，终止内循环。
			boolean flag = true;
			for (int j = 2; j < x; j++){
				if (x % j == 0){
					flag = false;
					break;
				}
			}
			if ( flag == true){
				System.out.println("质数:" + x);
				break;
			}
		}
	}

	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("输入数字:");
		int i = s.nextInt();
		minZhishu(i);
	}
}