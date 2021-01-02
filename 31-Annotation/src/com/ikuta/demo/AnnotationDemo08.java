package com.ikuta.demo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Target(value = ElementType.METHOD)
@Retention(value = RetentionPolicy.RUNTIME)
@interface MyAnnotation08 {
    String username();//账户属性

    String password();//密码属性
}

//注解注解属性
public class AnnotationDemo08 {
    @MyAnnotation08(username = "root", password = "admin")
    public void doSome() {

    }

    public static void main(String[] args) {
        try {
            Class className = Class.forName("com.ikuta.demo.AnnotationDemo08");
            Method method = className.getDeclaredMethod("doSome");
            if (method.isAnnotationPresent(MyAnnotation08.class)) {
                MyAnnotation08 annotation = (MyAnnotation08) method.getAnnotation(MyAnnotation08.class);
                System.out.println("账号:" + annotation.username());
                System.out.println("密码:" + annotation.password());
            }
            // 账号:admin
            // 密码:123
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (SecurityException e) {
            e.printStackTrace();
        }
    }
}