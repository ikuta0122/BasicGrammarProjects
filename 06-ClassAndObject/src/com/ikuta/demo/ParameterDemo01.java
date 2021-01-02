package com.ikuta.demo;

//参数传递时,无论是基本数据类型还是引用数据类型都是将后者中保存的“值”[内存地址也是值]复制一份再传递给前者
public class ParameterDemo01 {
    public static void main(String[] args) {
        //这个i是局部变量，域是main
        int i = 10;
        add(i);
        System.out.println("main-->" + i);//10
    }

    public static void add(int i) {
        //这个i是局部变量，域是add
        i++;
        System.out.println("add-->" + i);//11
    }
}
