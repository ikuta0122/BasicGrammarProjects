package com.ikuta.demo;

/*分析:封装与不封装的区别
要求1:Person类的name属性不封装
要求2:Person类的age属性封装
*/
public class Person {
    String name;
    //封装的第一步:属性被private修饰
    private int age;//private修饰的属性只能在本类中访问,需要对外提供访问入口才能访问

    //封装的第二步:对外提供公开的getter()方法和setter()方法作为操作入口
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 150) {
            System.out.println("年龄值在0到150,请重新赋值");
            return;
        }
        this.age = age;
    }

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}