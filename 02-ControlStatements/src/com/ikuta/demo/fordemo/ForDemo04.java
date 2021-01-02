package com.ikuta.demo.fordemo;

/*
1.实现1-100所有奇数求和
2.至少给出两种解决方法
3.使用for循环
*/
public class ForDemo04 {
    public static void main(String[] args) {
		//方法1:直接隔2求和，这样无需判断，每次得出的i的值都是奇数
		int sum = 0;
		for (int i = 1; i <= 100; i += 2){
			sum = sum + i;//或者写成  sum += i;
		}
		System.out.println("1-100所有奇数求和:" + sum);

		//方法2:找出奇数再求和，for循环中嵌套if语句
		sum = 0;
		for (int i = 1; i <= 100 ;i++){
			if (i % 2 == 1){
				sum = sum + i;//或者写成  sum += i;
			}
		}
		System.out.println("1-100所有奇数求和:" + sum);
        //相比较方法2来说，方法1的效率高，因为循环比较少
    }
}
