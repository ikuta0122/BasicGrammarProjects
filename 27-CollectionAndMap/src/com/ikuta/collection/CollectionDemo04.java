package com.ikuta.collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

//HashSet集合存储元素特点--->无序不可重复
public class CollectionDemo04 {
    public static void main(String[] args) {
        Collection hashSet = new HashSet();
        hashSet.add(100);
        hashSet.add(100);
        hashSet.add(200);
        hashSet.add(300);
        hashSet.add(400);
        System.out.println("集合元素个数:" + hashSet.size());
        Iterator setIterator = hashSet.iterator();
        while (setIterator.hasNext()) {
            System.out.println(setIterator.next());
        }
    }
}