package com.ikuta.collection.set.TreeSet;

import java.util.HashSet;
import java.util.Set;

//TreeSet集合的存储元素特点:无序不可重复,自动排序
public class TreeSetDemo03 {
    public static void main(String[] args) {
        Set hashSet = new HashSet();
        hashSet.add("c");
        hashSet.add("b");
        hashSet.add("a");
        hashSet.add("b");
        for (Object obj : hashSet) {
            System.out.print(obj + " ");
        }
        //a b c
        //无序    --->存储顺序为c b a b,读取顺序为a b c
        //不可重复--->存储元素不允许存在两个值相同[a]的String对象
        //自动排序--->存储顺序为c b a b,读取顺序为a b c
    }
}