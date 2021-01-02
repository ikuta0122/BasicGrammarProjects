package com.ikuta.collection.set.TreeSet;

import java.util.*;

//TreeSet集合的构造方法
public class TreeSetDemo01 {
    public static void main(String[] args) {
        //创建一个空的TreeSet集合
        Set treeSet1 = new TreeSet();

        //将其他Collection集合转换为TreeSet集合
        Collection list = new ArrayList();
        Set treeSet2 = new TreeSet(list);
    }
}
