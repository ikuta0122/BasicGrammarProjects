package com.ikuta.map.HashMap;

import java.util.HashMap;
import java.util.Map;

//HashMap集合中的key允许存在null,有且仅有一个
public class HashMapDemo05 {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(null, "张三");
        hashMap.put(null, "李四");
        System.out.println("集合中的元素个数 : " + hashMap.size());
    }
}
