package com.ikuta.map.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

//HashMap集合的构造方法
public class HashMapDemo01 {
    public static void main(String[] args) {
        //创建默认初始化容量的HashMap集合
        Map<Integer, String> hashMap1 = new HashMap<>();
        //创建指定初始化容量的HashMap集合
        Map<Integer, String> hashMap2 = new HashMap<>(16);
        //创建指定初始化容量和指定扩容因子的HashMap集合
        Map<Integer, String> hashMap3 = new HashMap<>(16, 0.75F);
        //将其他Map集合转换为HashMap集合
        Map<Integer, String> treeMap = new TreeMap<>();
        Map<Integer, String> hashMap4 = new HashMap<>(treeMap);
    }
}
