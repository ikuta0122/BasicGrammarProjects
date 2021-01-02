package com.ikuta.demo;

import java.util.Arrays;

//一维数组的扩容[数组长度不可变导致数组满了只能进行扩容操作]
//数组拷贝属于浅拷贝
public class ArrayDemo08 {
    public static void main(String[] args) {
        //情景1:测试数组拷贝方法
        int[] src = {1994, 5, 25};//原数组
        int[] srcCopy = new int[9];//目标数组
        System.arraycopy(src, 0, srcCopy, 0, src.length);
        System.out.println(Arrays.toString(src));//[1994, 5, 25]
        System.out.println(Arrays.toString(srcCopy));//[1994, 5, 25, 0, 0, 0, 0, 0, 0]

        //情景2:论证数组拷贝属于浅拷贝
        Object[] objects = {new Object(), new Object(), new Object()};
        Object[] objectsCopy = new Object[3];
        System.arraycopy(objects, 0, objectsCopy, 0, objects.length);
        System.out.println(objects[1]);//java.lang.Object@61bbe9ba
        System.out.println(objectsCopy[1]);//java.lang.Object@61bbe9ba
        System.out.println(objects[1] == objectsCopy[1]);//true
    }
}