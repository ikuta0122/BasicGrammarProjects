package com.ikuta.demo;

//二维数组的静态初始化和遍历
public class ArrayDemo10 {

    public static void main(String[] args) {
        int[][] array = {{1994, 5, 25}, {1998, 2, 6}, {1997, 1, 22}};//静态初始化二维数组
        System.out.println(array.length);//获取二维数组的长度
        System.out.println(array[0].length);//获取二维数组首元素的长度

        //遍历二维数组
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
