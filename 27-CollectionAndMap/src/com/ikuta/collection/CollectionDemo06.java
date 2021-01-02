package com.ikuta.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*关于ConcurrentModificationException并发修改异常
Iterator iterator = collection.iterator();
首先,迭代器iterator指向元素尚未添加前的集合
collection.add(1);
collection.add(2);
collection.add(3);
其次,集合中添加了元素后,集合结构发生改变导致当前集合状态和迭代器快照不同
最后,没有重新获取迭代器导致ConcurrentModificationException并发修改异常发生
*/
//ConcurrentModificationException并发修改异常
public class CollectionDemo06 {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        // Iterator iterator = collection.iterator();//发生ConcurrentModificationException并发修改异常
        collection.add(1);
        collection.add(2);
        collection.add(3);
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
