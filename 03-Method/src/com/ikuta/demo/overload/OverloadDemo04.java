package com.ikuta.demo.overload;

public class OverloadDemo04 {
    public static void main(String[] args){
        //println是不是一个方法名？
        //println()是sun公司的java团队写的一个方法，可以直接使用
        //参数类型可以随便传，这说明println()方法重载了
        System.out.println(10);
        System.out.println(10.0);
        System.out.println(true);
        System.out.println('a');
        System.out.println("a");
    }
}