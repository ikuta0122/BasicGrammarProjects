package com.ikuta.demo;

//测试构造方法
public class ConstructorDemo01 {
    public static void main(String[] args) {
        Student s1 = new Student();
        //输出“引用”，只要输出结果不是null，说明这个对象创建成功了
        System.out.println(s1);//Student@5caf905d

        Student s2 = new Student(100);
        //输出“引用”，只要输出结果不是null，说明这个对象创建成功了
        System.out.println(s2);//Student@27716f4

    }
}

class Student {
    int id;

    public Student() {
    }

    public Student(int id) {
        this.id = id;
    }
}