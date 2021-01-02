package com.ikuta.demo.method;

//关于可变长度参数
public class MethodDemo10 {
    //情景1:可变长度参数方法的声明
    public static void m1(int... args) {
        System.out.println("执行m1()方法");
    }

    //情景2:如果形参列表存在可变长度参数,那么只有1个且必须在最后
    public static void m2(int i, String... args) {
        System.out.println("执行m2()方法");
    }

    //情景3:如果形参列表存在可变长度参数,那么编译器将其转化为一个数组形参
    public static void m3(String... args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }

    //情景4:可变长度参数方法的调用
    public static void main(String[] args) {
    	m3("a","b","c","d","e");
    }
}