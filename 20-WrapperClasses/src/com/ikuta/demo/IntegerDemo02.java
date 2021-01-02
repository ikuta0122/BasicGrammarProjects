package com.ikuta.demo;

//装箱和拆箱
public class IntegerDemo02 {
    public static void main(String[] args) {
        //装箱:基本数据类型 ---（转换）---> 引用数据类型
        Integer i = new Integer(123);
        //拆箱:引用数据类型 ---（转换）---> 基本数据类型
        float f = i.floatValue();
        System.out.println(f);
    }
}