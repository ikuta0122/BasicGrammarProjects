package com.ikuta.demo;

//数组作为方法实参传入
public class ArrayDemo03 {
    public static void main(String[] args) {
        int[] a = {1994, 5, 25};
        printArray(a);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("int数组中的元素 : " + array[i]);
        }
    }
}