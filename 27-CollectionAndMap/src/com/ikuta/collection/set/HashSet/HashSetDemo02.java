package com.ikuta.collection.set.HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*HashSet集合的使用
添加元素
读取元素
删除元素
遍历集合
*/
public class HashSetDemo02 {
    public static void main(String[] args) {
        Set hashSet = new HashSet();
        //添加元素
        hashSet.add("a");
        hashSet.add("b");
        hashSet.add("c");
        hashSet.add("d");
        System.out.println("集合元素个数:" + hashSet.size());

        //删除元素
        hashSet.remove("d");
        System.out.println("集合元素个数:" + hashSet.size());

        //读取元素 + 集合遍历
        for (Object obj : hashSet) {
            System.out.print(obj + " ");
        }
        System.out.println();
        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}