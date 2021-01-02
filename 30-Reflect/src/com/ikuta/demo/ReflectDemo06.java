package com.ikuta.demo;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * 用于测试反射机制获取属性Field
 * Student类中的四个属性分别采用不同的访问控制权限
 */
class Student {
    private String name;
    boolean sex;
    protected int age;
    public int no;
}

/**
 * 通过反射机制获取属性Field的相关数据
 * 获取属性的修饰符列表	Modifier.toString(field.getModifiers())
 * 获取属性的类型名		field.getType().getSimpleName()
 * 获取属性名			field.getSimpleName()
 */
public class ReflectDemo06 {
    public static void main(String[] args) {
        try {
            Class studentClass = Class.forName("com.ikuta.demo.Student");
            //情景:获取类中的所有公开属性
            Field[] fields1 = studentClass.getFields();
            System.out.println("类中的所有公开属性个数为 : " + fields1.length);
            System.out.println();

            //情景2:获取类中的所有属性
            Field[] fields2 = studentClass.getDeclaredFields();
            System.out.println("类中的所有属性个数为 : " + fields2.length);
            System.out.println();

            //情景3:遍历输出类中的修饰符列表,类型名和属性名
            for (Field field : fields2) {
                System.out.println(
                        Modifier.toString(field.getModifiers())
                                + " "
                                + field.getType().getSimpleName()
                                + " "
                                + field.getName()
                );
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SecurityException e) {
            e.printStackTrace();
        }
    }
}