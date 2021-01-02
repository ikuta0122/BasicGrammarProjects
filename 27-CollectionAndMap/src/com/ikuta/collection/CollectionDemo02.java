package com.ikuta.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

//Iterator迭代器
public class CollectionDemo02 {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        collection.add("abc");
        collection.add("def");
        collection.add(100);
        collection.add(new Object());

        // 通过迭代器遍历集合
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
