package com.ikuta.map.TreeMap;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*TreeMap集合的使用
添加元素
读取元素
删除元素
遍历集合
*/
public class TreeMapDemo02 {
    public static void main(String[] args) {
        Map<Integer, String> treeMap = new TreeMap();
        //添加元素
        treeMap.put(1, "a");
        treeMap.put(2, "b");
        treeMap.put(3, "c");
        System.out.println("集合元素个数:" + treeMap.size());

        //删除元素
        treeMap.remove(1);
        System.out.println("集合元素个数:" + treeMap.size());

        //遍历集合 + 读取元素
        Set<Map.Entry<Integer, String>> entries = treeMap.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}