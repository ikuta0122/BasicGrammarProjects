package com.ikuta.test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

//反编译Field
public class ReflectTest01 {
    public static void main(String[] args) {
        try {
            StringBuilder stringBuilder = new StringBuilder();
            Class studentClass = Class.forName("com.ikuta.config.Student");

            //进行字符串拼接
            stringBuilder.append(Modifier.toString(studentClass.getModifiers()) + " class " + studentClass.getSimpleName() + "{");
            stringBuilder.append("\n");
            Field[] fields = studentClass.getDeclaredFields();
            for (Field field : fields) {
                stringBuilder.append("\t");
                stringBuilder.append(Modifier.toString(field.getModifiers()));
                stringBuilder.append(" ");
                stringBuilder.append(field.getType().getSimpleName());
                stringBuilder.append(" ");
                stringBuilder.append(field.getName());
                stringBuilder.append(";");
                stringBuilder.append("\n");
            }
            stringBuilder.append("}");
            System.out.println(stringBuilder);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}