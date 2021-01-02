package com.ikuta.map.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*HashMap集合的使用
添加元素
删除元素
读取元素
集合遍历
*/
public class HashMapDemo02 {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();
        //添加元素
        hashMap.put(1, "a");
        hashMap.put(2, "b");
        hashMap.put(3, "c");
        //删除元素
        hashMap.remove(1);
        //读取元素
        System.out.println(hashMap.get(2));
        //集合遍历
        Set<Map.Entry<Integer, String>> entries = hashMap.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
