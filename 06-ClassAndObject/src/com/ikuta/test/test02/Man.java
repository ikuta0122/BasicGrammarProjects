package com.ikuta.test.test02;

/*
2.	设计男人类，每个男人都有身份证号、姓名、性别、女人
	设计女人类，每个女人都有身份证号、姓名、性别、男人
*/
public class Man{
	String no;
	String name;
	static boolean sex = true;
	Woman woman;
	public Man(){
		
	}
	public Man(String a,String b,boolean c , Woman d){
		no = a;
		name = b;
		sex = c;
		woman = d;
	}
}