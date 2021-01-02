package com.ikuta.demo;

@interface MyAnnotation05 {
    String value();
}

//当注解中的属性只有一个value时,value可以省略
@MyAnnotation05("hello")
public class AnnotationDemo05 {
}