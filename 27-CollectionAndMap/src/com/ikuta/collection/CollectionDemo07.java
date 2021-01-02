package com.ikuta.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*关于迭代器对象remove()方法
迭代器对象的remove()方法删除的是迭代器指向的当前元素
迭代器对象的remove()方法同时删除迭代器快照和集合中的元素
迭代器对象的remove()方法删除元素时会自动更新迭代器和集合
*/
//在遍历集合中,应该使用迭代器的remove()方法而不是集合对象的remove()方法删除元素
public class CollectionDemo07 {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        collection.add("abc");
        collection.add("def");
        collection.add("xyz");
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            // collection.remove(obj);//发生ConcurrentModificationException并发修改异常
            iterator.remove();
            System.out.println(obj);
        }
        System.out.println("集合是否为空?" + collection.isEmpty());
    }
}
