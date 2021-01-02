package com.ikuta.demo;

import java.util.Arrays;

//使用java.util.Arrays工具类进行一维数组的排序,查找和遍历
public class ArrayDemo09 {
    public static void main(String[] args) {
        int[] arr = {1996, 3, 15, 1994, 5, 25};
        Arrays.sort(arr);//排序
        System.out.println(Arrays.toString(arr));//遍历
        int index = Arrays.binarySearch(arr, 777);//查找[二分法查找建立在数组有序的基础上]
        System.out.println(index == -1 ? "该元素不存在" : "该元素下标是" + index);
    }
}
