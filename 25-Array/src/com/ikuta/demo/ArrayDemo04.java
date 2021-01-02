package com.ikuta.demo;

//数组作为方法实参传入
public class ArrayDemo04 {
    public static void main(String[] args) {
        printArray(new int[]{1994, 5, 25});//传入数组采用静态初始化
        printArray(new int[3]);//传入数组采用动态初始化
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("int数组中的元素 : " + array[i]);
        }
    }
}
