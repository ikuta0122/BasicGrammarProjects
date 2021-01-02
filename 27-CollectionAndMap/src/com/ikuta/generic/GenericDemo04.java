package com.ikuta.generic;

//使用自定义泛型
public class GenericDemo04 {
    public static void main(String[] args) {
        Student<Integer> student1 = new Student<>();
        student1.doSome(100);
        Student<String> student2 = new Student<>();
        student2.doSome("HelloWorld");
        Student<Object> student3 = new Student<>();
        student3.doSome(student3);
    }
}

class Student<E> {
    public void doSome(E element) {
        System.out.println(element);
    }
}
