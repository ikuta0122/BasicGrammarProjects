package com.ikuta.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

//ArrayList集合存储元素特点--->有序可重复
public class CollectionDemo03 {
    public static void main(String[] args) {
        Collection arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        System.out.println("集合元素个数" + arrayList.size());
        Iterator listIterator = arrayList.iterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
    }
}