package com.ikuta.demo;

//二维数组的元素读写
public class ArrayDemo11 {
    public static void main(String[] args) {
        int[][] a = {{1994, 5, 25}, {1998, 2, 6}, {1997, 1, 22}};
        //要求：遍历二维数组的首元素
        for (int i = 0; i < a[0].length; i++) {
            System.out.print(a[0][i] + " ");
        }
        // 控制台输出：1994 5 25
    }
}
