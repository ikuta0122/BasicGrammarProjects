package com.ikuta.demo;

@interface MyAnnotation01 {

}

//注解的出现位置:类、接口、枚举、属性、方法、变量、形参、注解...
@MyAnnotation01
public class AnnotationDemo01 {
    @MyAnnotation01
    int no;

    @MyAnnotation01
    public static void m1() {
    }

    public static void m2(@MyAnnotation01 String name) {
    }

    @MyAnnotation01
    public AnnotationDemo01() {
        super();
    }

}

@MyAnnotation01
interface MyInterface {

}

@MyAnnotation01
enum Season {
    Spring, Summer, Autumn, Winter
}