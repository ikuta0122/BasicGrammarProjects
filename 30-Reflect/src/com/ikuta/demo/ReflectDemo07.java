package com.ikuta.demo;

import java.lang.reflect.Field;

//通过反射机制读写对象属性以及反射机制的缺点
public class ReflectDemo07 {
    public static void main(String[] args) {
        try {
            Class studentClass = Class.forName("com.ikuta.demo.Student");
            Object obj = studentClass.newInstance();
            //情景1:通过反射机制读写对象属性
            Field noField = studentClass.getDeclaredField("no");
            noField.set(obj, 101);
            System.out.println(noField.get(obj));

            //情景2:反射机制的缺点--->打破封装访问私有属性
            Field nameField = studentClass.getDeclaredField("name");
            nameField.setAccessible(true);
            nameField.set(obj, "jack");
            System.out.println(nameField.get(obj));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (SecurityException e) {
            e.printStackTrace();
        }
    }
}