package com.ikuta.demo.fordemo;

/*
为什么要使用循环？
    循环语句的出现就是为了解决代码的复用性。
什么时候可以考虑使用循环？
    相同的代码重复出现的时候，可以使用循环语句
*/
public class ForDemo01 {
    public static void main(String[] args) {
        //要求在控制台上输出100个100

		/*
		System.out.println("100");
		System.out.println("100");
		System.out.println("100");
		System.out.println("100");
		...
		重复的代码太多了，这时候就需要使用循环语句来简化代码
		*/
        for (int i = 0; i < 100; i++) {
            System.out.println("100");
        }
    }
}
