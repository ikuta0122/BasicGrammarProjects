package com.ikuta.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//接口Map的遍历
public class MapDemo02 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(2, "lisi");
        map.put(4, "zhaoliu");
        map.put(3, "wangwu");
        map.put(1, "zhangsan");

        // 第一种方式：获取Map集合所有的key,通过遍历key来获取value
        Set<Integer> set1 = map.keySet();
        for (Integer key : set1) {
            System.out.println(key + "=" + map.get(key));
        }

        System.out.println();

        // 第二种方式：将Map集合转换成Set集合,遍历Set集合
        Set<Map.Entry<Integer, String>> set2 = map.entrySet();
        Iterator<Map.Entry<Integer, String>> it = set2.iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, String> node = it.next();
            System.out.println(node.getKey() + "=" + node.getValue());
        }
    }
}