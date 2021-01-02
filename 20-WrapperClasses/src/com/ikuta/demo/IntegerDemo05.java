package com.ikuta.demo;

//JDK1.5后支持自动拆箱和自动装箱
//自动拆箱机制的触发条件
public class IntegerDemo05 {
    public static void main(String[] args) {
		//JDK1.5后支持自动拆箱和自动装箱
    	Integer x = 900;//自动装箱
        int y = x;//自动拆箱

		//思考:自动拆箱机制的触发条件
		//情景1:触发自动拆箱
        int z = x + 100;//遭遇"+"运算符触发自动拆箱

		//情景2:不触发自动拆箱
        Integer a = 1000;//Integer a = new Integer(1000);
        Integer b = 1000;//Integer b = new Integer(1000);
        System.out.println(a == b);//false
        //	原因1：a和b是引用，存储的是内存地址
        //	原因2:"=="比较的是对象的内存地址
        //	结论:"=="不会触发自动拆箱机制,只有 + - * / %等运算时才会触发
    }
}