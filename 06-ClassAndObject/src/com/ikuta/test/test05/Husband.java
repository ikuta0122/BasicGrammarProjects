package com.ikuta.test.test05;

/*
5.定义丈夫类Husband和妻子类Wife
丈夫类的属性包括：身份证号、姓名、生日、妻子
妻子类的属性包括：身份证号、姓名、生日、丈夫
*/
public class Husband{
	String number;
	String name;
	String birthday;
	Wife wife;

	public Husband(){

	}
	public Husband(String a,String b,String c,Wife d){
		number = a;
		name = b;
		birthday = c;
		wife = d;
	}
}