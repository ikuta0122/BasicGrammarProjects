package com.ikuta.test.test05;

/*
5.定义丈夫类Husband和妻子类Wife
丈夫类的属性包括：身份证号、姓名、生日、妻子
妻子类的属性包括：身份证号、姓名、生日、丈夫
*/
public class Wife{
	String number;
	String name;
	String birthday;
	Husband husband;

	public Wife(){

	}
	public Wife(String a,String b,String c, Husband d){
		number = a;
		name = b;
		birthday = c;
		husband = d;
	}
}