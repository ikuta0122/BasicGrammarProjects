package com.ikuta.demo;

@interface MyAnnotation04 {
    String name();//声明注解属性

    String color();//声明注解属性

    int age() default 25;////声明注解属性并且赋默认值
}

//注解的属性
@MyAnnotation04(name = "jack", color = "red")
public class AnnotationDemo04 {
}