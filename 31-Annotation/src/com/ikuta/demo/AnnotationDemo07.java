package com.ikuta.demo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value = ElementType.TYPE)
@Retention(value = RetentionPolicy.RUNTIME)
@interface MyAnnotation07 {
    String value() default "北京大兴区";
}

//元注解@Target和@Retention
@MyAnnotation07("福建泉州")
public class AnnotationDemo07 {
    /*情景:使用元注解@Target确定注解的作用范围
    @MyAnnotation07 int index;
    报错:'@MyAnnotation07' not applicable to field
    */
}
