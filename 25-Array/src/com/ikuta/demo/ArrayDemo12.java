package com.ikuta.demo;

//二维数组作为方法实参传入
public class ArrayDemo12 {
    public static void main(String[] args) {
        int[][] array = new int[7][7];//二维数组的动态初始化
        printArray(array);
    }

    /**
     * 遍历二维数组
     */
    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}