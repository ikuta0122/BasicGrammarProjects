package com.ikuta.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//接口Map的常用方法
public class MapDemo01 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        // 向Map集合中添加键值对
        map.put(1, "zhangsan");
        map.put(2, "lisi");
        map.put(3, "wangwu");
        map.put(4, "zhaoli");

        // 通过key获取value
        System.out.println("Map集合中key为2的value是：" + map.get(2));

        // 获取键值对的数量
        System.out.println("键值对的数量：" + map.size());

        // 获取Map集合中所有的key,返回一个Set集合
        Set<Integer> set = map.keySet();
        for (Integer integer : set) {
            System.out.println(integer);
        }

        // 获取Map集合中所有的value,返回一个Collection集合
        Collection<String> collection = map.values();
        for (String string : collection) {
            System.out.println(string);
        }

        // 通过key删除键值对
        map.remove(2);
        System.out.println("键值对的数量：" + map.size());

        // 判断Map集合中是否包含某个key
        System.out.println(map.containsKey(2));

        // 判断Map集合中是否包含某个value
        System.out.println(map.containsValue("lisi"));

        // 判断Map集合中元素个数是否为0
        System.out.println(map.isEmpty());

        // 清空Map集合
        map.clear();
        System.out.println(map.isEmpty());
    }
}