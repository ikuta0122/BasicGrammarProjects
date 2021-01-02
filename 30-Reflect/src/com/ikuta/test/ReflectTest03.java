package com.ikuta.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

//反编译Constructor
public class ReflectTest03 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        Class vipClass;
        //拼接构造方法
        try {
            vipClass = Class.forName("com.ikuta.demo.Vip");
            stringBuilder.append(Modifier.toString(vipClass.getModifiers()));
            stringBuilder.append(" class ");
            stringBuilder.append(vipClass.getSimpleName());
            stringBuilder.append("{");
            stringBuilder.append("\n");
            Constructor[] constructors = vipClass.getConstructors();
            for (Constructor constructor : constructors) {
                stringBuilder.append("\t");
                stringBuilder.append(Modifier.toString(constructor.getModifiers()));
                stringBuilder.append(" ");
                stringBuilder.append(vipClass.getSimpleName());
                stringBuilder.append("(");
                Class[] parameterTypes = constructor.getParameterTypes();
                for (Class parameterType : parameterTypes) {
                    stringBuilder.append(parameterType.getSimpleName());
                    stringBuilder.append(",");
                }
                if (parameterTypes.length > 0) {
                    stringBuilder.deleteCharAt(stringBuilder.length() - 1);
                }
                stringBuilder.append(")");
                stringBuilder.append("{}");
                stringBuilder.append("\n");
            }
            stringBuilder.append("}");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(stringBuilder);
    }
}
