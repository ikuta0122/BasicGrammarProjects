package com.ikuta.map.Hashtable;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

//Hashtable集合的存储元素特点
public class HashtableDemo03 {
    public static void main(String[] args) {
        Map<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(1, "a");
        hashtable.put(2, "b");
        hashtable.put(1, "d");
        hashtable.put(3, "c");
        System.out.println("集合元素个数: " + hashtable.size());
        Set<Map.Entry<Integer, String>> entries = hashtable.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
        //无序    --->存储顺序1 2 1 3,读取顺序3 2 1
        //不可重复--->Hashtable集合不允许存在key相同的键值对
    }
}
