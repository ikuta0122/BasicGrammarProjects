package com.ikuta.test;

//面试题:分析以下程序创建了几个对象
/*答案:3个
1个字符串对象"hello"存储于方法区的字符串常量池
2个String对象存储于堆内存
*/
public class StringTest01 {
	public static void main(String[] args) {
		String s1 = new String("hello");
		String s2 = new String("hello");
	}
}