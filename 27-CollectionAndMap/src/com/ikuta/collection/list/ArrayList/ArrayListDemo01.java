package com.ikuta.collection.list.ArrayList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

//ArrayList集合的构造方法
public class ArrayListDemo01 {
    public static void main(String[] args) {
        // 默认初始化容量（10）
        List arrayList1 = new ArrayList();

        // 指定初始化容量（20）
        List arrayList2 = new ArrayList(20);

        //将其他Collection集合转换为List集合
        List arrayList3 = new ArrayList(new HashSet());
    }
}