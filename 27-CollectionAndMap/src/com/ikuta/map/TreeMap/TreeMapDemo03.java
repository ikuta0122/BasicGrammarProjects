package com.ikuta.map.TreeMap;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

//TreeMap集合的存储元素特点:无序不可重复,自动排序
public class TreeMapDemo03 {
    public static void main(String[] args) {
        Map treeMap = new TreeMap();
        treeMap.put(3, "c");
        treeMap.put(1, "a");
        treeMap.put(2, "b");
        treeMap.put(1, "d");
        Set<Map.Entry<Integer, String>> entries = treeMap.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.print(entry.getKey() + " = " + entry.getValue() + " ");
        }
        //1 = d 2 = b 3 = c
        //无序    --->存储顺序为3 1 2 1,读取顺序为1 2 3
        //不可重复--->存储元素不允许存在key相同的键值对
        //自动排序--->存储顺序为3 1 2 1,读取顺序为1 2 3
    }
}