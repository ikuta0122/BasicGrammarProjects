package com.ikuta.map.Hashtable;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

/*Hashtable集合的使用
添加元素
删除元素
读取元素
集合遍历
*/
public class HashtableDemo02 {
    public static void main(String[] args) {
        Map<Integer, String> hashtable = new Hashtable<>();
        //添加元素
        hashtable.put(1, "a");
        hashtable.put(2, "b");
        hashtable.put(3, "c");
        //删除元素
        hashtable.remove(3);
        //读取元素
        System.out.println(hashtable.get(1));
        //集合遍历
        Set<Map.Entry<Integer, String>> entries = hashtable.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
