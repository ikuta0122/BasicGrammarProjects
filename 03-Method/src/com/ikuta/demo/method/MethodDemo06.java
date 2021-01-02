package com.ikuta.demo.method;

//return终止当前方法的执行
public class MethodDemo06 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                return;
            }
            System.out.println("i=" + i);
        }
        System.out.println("Hello World");
    }
}