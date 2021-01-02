package com.ikuta.demo;

@interface MyAnnotation06 {
    String[] email();

    Season[] seasonArray();
}

//注解的参数类型为数组
@MyAnnotation06(
        email = {"934442950@qq.com", "527920879@qq.com"},
        seasonArray = Season.Spring//当注解中的属性是数组类型而数组中只有一个元素时,大括号可以省略
)
public class AnnotationDemo06 {
}