package com.ikuta.demo.recursion;

//不使用递归，编写程序：计算1到n的和
public class RecursionDemo02 {
    public static void main(String[] args) {
        //1到10的和
        int a = sum(10);
        System.out.println(a);
    }

    //定义一个方法：计算1到n的和
    public static int sum(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }
        return result;
    }
}