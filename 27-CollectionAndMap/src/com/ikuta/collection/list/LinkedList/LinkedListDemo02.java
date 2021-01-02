package com.ikuta.collection.list.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/*LinkedList集合的使用
添加元素
读取元素
删除元素
遍历集合
*/
public class LinkedListDemo02 {
    public static void main(String[] args) {
        List linkedList = new LinkedList();
        //添加元素
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");
        linkedList.add("d");
        System.out.println("集合元素个数:" + linkedList.size());

        //删除元素
        linkedList.remove("d");
        System.out.println("集合元素个数:" + linkedList.size());

        //读取元素 + 集合遍历
        for (Object obj : linkedList) {
            System.out.print(obj + " ");
        }
        System.out.println();
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.print(linkedList.get(i) + " ");
        }
        System.out.println();

        Iterator iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}