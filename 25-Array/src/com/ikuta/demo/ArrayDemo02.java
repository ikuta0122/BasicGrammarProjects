package com.ikuta.demo;

//一维数组的动态初始化
public class ArrayDemo02 {
    public static void main(String[] args) {
        int[] array = new int[4];//一维数组的动态初始化,每个元素的默认值为0
        array[0] = 46;
        array[1] = 1994;
        array[2] = 5;
        array[3] = 25;
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}