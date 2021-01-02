package com.ikuta.demo;

//结论:this可以使用在实例方法中，不能使用在静态方法中
public class ThisDemo03 {
    public static void main(String[] args) {
        User s = new User();
        s.setNo(1111);
        s.setName("张三");
        System.out.println("学号:" + s.getNo());
        System.out.println("姓名:" + s.getName());

        User s2 = new User(2222, "李四");
        System.out.println("学号:" + s2.getNo());
        System.out.println("姓名:" + s2.getName());
    }
}

//this的作用：增强代码可读性[区分局部变量和实例变量]
class User {
    private int no;

    public int getNo() {
        return this.no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User() {

    }

    public User(int no, String name) {
        this.no = no;
        this.name = name;
    }
}