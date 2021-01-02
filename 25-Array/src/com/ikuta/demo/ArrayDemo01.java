package com.ikuta.demo;

//一维数组的静态初始化
//一维数组的常用方法
//遍历一维数组
public class ArrayDemo01 {
    public static void main(String[] args) {
        int[] array = {1994, 5, 25, 1998, 2, 6};//一维数组的静态初始化

        System.out.println("数组中元素个数：" + array.length);
        System.out.println("读取首元素：" + array[0]);
        System.out.println("读取尾元素：" + array[array.length - 1]);

        //从首元素遍历一维数组
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        //从尾元素开始遍历一维数组
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}