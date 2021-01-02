package com.ikuta.test;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

//反编译Method
public class ReflectTest02 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        Class userServiceClass;
        //拼接类的方法
        try {
            userServiceClass = Class.forName("com.ikuta.demo.UserService");
            stringBuilder.append(
                    Modifier.toString(userServiceClass.getModifiers())
                            + " class "
                            + userServiceClass.getSimpleName()
                            + "{"
            );
            stringBuilder.append("\n");

            Method[] methods = userServiceClass.getDeclaredMethods();//获取类的所有方法
            for (Method method : methods) {
                stringBuilder.append("\t");
                stringBuilder.append(Modifier.toString(method.getModifiers()));
                stringBuilder.append(" ");
                stringBuilder.append(method.getReturnType().getSimpleName());
                stringBuilder.append(" ");
                stringBuilder.append(method.getName());
                stringBuilder.append("(");
                Class[] parameterTypes = method.getParameterTypes();
                for (Class parameterType : parameterTypes) {
                    stringBuilder.append(parameterType.getSimpleName());
                    stringBuilder.append(",");
                }
                stringBuilder.deleteCharAt(stringBuilder.length() - 1);
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
