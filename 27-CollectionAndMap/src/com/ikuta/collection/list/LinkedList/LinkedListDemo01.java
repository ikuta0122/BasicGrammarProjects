package com.ikuta.collection.list.LinkedList;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

//LinkedList集合的构造方法
public class LinkedListDemo01 {
    public static void main(String[] args) {
        //创建一个空的LinkedList集合
        List linkedList1 = new LinkedList();
        Collection hashSet = new HashSet();
        //将其他Collection集合转换为LinkedList集合
        List linkedList2 = new LinkedList(hashSet);
    }
}
