package com.ikuta.test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;

@Target(value = ElementType.TYPE)
@Retention(value = RetentionPolicy.RUNTIME)
@interface ID {

}

@ID
class User {
    int id;
    String name;
    String birth;
}

class NoSuchIDPropertyException extends RuntimeException {
    public NoSuchIDPropertyException() {
        super();
    }

    public NoSuchIDPropertyException(String message) {
        super(message);
    }
}

/**
 * 设计注解@ID
 * 需求1:注解@ID只能出现在类上
 * 需求2:注解@ID用于检测类中是否具有int类型的id属性
 * 需求3:如果有则正常执行,如果无则报异常
 */
public class AnnotationTest {
    public static void main(String[] args) {
        //0.准备boolean标记记录结果
        boolean flag = false;
        //1.遍历类ID的所有属性
        try {
            //第一步:
            Class className = Class.forName("com.ikuta.test.User");
            if (className.isAnnotationPresent(ID.class)) {
                Field[] fields = className.getDeclaredFields();
                for (Field field : fields) {
                    if ("id".equals(field.getName()) && "int".equals(field.getType().getSimpleName())) {
                        flag = true;
                        break;
                    }
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //2.输出结果
        if (!flag) {
            throw new NoSuchIDPropertyException("类ID中没有具有类型int的属性id");
        }
        System.out.println("类ID中具有类型int的属性id");
    }
}