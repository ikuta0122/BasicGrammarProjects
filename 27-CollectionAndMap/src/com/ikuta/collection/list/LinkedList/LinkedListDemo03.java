package com.ikuta.collection.list.LinkedList;

import java.util.LinkedList;
import java.util.List;

//LinkedList集合的存储元素特点:有序可重复,有下标
public class LinkedListDemo03 {
    public static void main(String[] args) {
        List linkedList = new LinkedList();
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");
        linkedList.add("a");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.print(linkedList.get(i) + " ");
        }
        //a b c a
        //有序  --->存储顺序为a b c a,读取顺序为a b c a
        //可重复--->存储元素允许存在两个值相同[a]的String对象
        //有下标--->存储元素可以通过下标获取
    }
}