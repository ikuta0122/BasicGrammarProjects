package com.ikuta.demo;

//三大变量的访问方式
public class ThisDemo02 {
    int i = 100;//实例变量
    static int k = 200;//静态变量在类加载时初始化

    public static void main(String[] args) {
        int j = 300;//成员变量

        //测试1:如何访问实例变量i?
        ThisDemo02 a = new ThisDemo02();
        System.out.println(a.i);

        //测试2:如何访问静态变量k?
        System.out.println(ThisDemo02.k);
        System.out.println(k); //同一个类中，可以省略“类名.”

        //测试3:如何访问成员变量j?
        System.out.println(j);

    }
}