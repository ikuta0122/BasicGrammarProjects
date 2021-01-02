package com.ikuta.encapsulation.test.test03;

/*
3.(封装)已知一个类Student代码如下：
class Student{
	String name;
	int age;
	String address;
	String zipCode;
	String mobile;
}
要求1：把Student的属性都作为私有，并提供get和set方法以及适当的构造方法。
要求2：为Student类添加一个getPostAddress方法，要求返回Student对象的地址和邮编
*/
public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student("小明", 20, "北京", "100000", "123456789");
        System.out.println(s1.getPostAddress());
    }
}