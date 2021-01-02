package com.ikuta.map.Hashtable;

import java.util.*;

//Hashtable集合的构造方法
public class HashtableDemo01 {
    public static void main(String[] args) {
        // 创建默认初始化容量的Hashtable集合
        Map<Integer, String> hashtable1 = new Hashtable<>();
        // 创建指定初始化容量的Hashtable集合
        Map<Integer, String> hashtable2 = new Hashtable<>(11);
        // 创建指定初始化容量和指定扩容因子的Hashtable集合
        Map<Integer, String> hashtable3 = new Hashtable<>(11, 0.75F);
        // 将其他Map集合转换为Hashtable集合
        Map<Integer, String> hashMap = new HashMap<>();
        Map<Integer, String> hashtable4 = new Hashtable<>(hashMap);
    }
}
