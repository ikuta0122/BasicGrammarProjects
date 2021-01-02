package com.ikuta.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

//接口Collection的常用方法
public class CollectionDemo01 {
    public static void main(String[] args) {
        Collection collection = new ArrayList();

        // 方法1:boolean add(E e)
        collection.add(100);

        // 方法2:int size()
        System.out.println("集合中元素的个数:" + collection.size());

        // 方法3:void clear()
        collection.clear();
        System.out.println("集合中元素的个数:" + collection.size());

        // 方法4：boolean contains(Object o)
        System.out.println("集合中是否含有值为100的元素:" + collection.contains(100));

        // 方法5:boolean remove(Object o)
        collection.remove(100);
        System.out.println("集合中元素的个数:" + collection.size());

        // 方法6：boolean isEmpty()
        System.out.println("集合是否为空：" + collection.isEmpty());

        // 方法7:Object[] toArray()
        collection.add("abc");
        collection.add("def");
        collection.add("xyz");
        Object[] objs = collection.toArray();
        System.out.println(Arrays.toString(objs));
    }
}