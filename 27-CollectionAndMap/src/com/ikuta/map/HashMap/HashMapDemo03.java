package com.ikuta.map.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//HashMap集合的存储元素特点:无序不可重复
public class HashMapDemo03 {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(4, "d");
        hashMap.put(3, "c");
        hashMap.put(1, "a");
        hashMap.put(4, "d");
        hashMap.put(2, "b");

        Set<Integer> keySet = hashMap.keySet();
        for (Integer integer : keySet) {
            System.out.println(integer + " = " + hashMap.get(integer));
        }
        // 1=zhangsan 2=lisi 3=wangwu 4=king
        //无序    --->存储顺序为4 3 1 4 2,读取顺序为1 2 3 4
        //不可重复--->存储元素不允许存在两个key相同的键值对
    }
}
