package com.ikuta.collection.set.HashSet;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

//HashSet集合的构造方法
public class HashSetDemo01 {
    public static void main(String[] args) {
        //创建默认初始化容量的HashSet集合
        Set hashSet1 = new HashSet();
        //创建指定初始化容量的的HashSet集合
        Set hashSet2 = new HashSet(16);
        //创建指定初始化容量和指定扩容因子的HashSet集合
        Set hashSet3 = new HashSet(16, 0.75F);
        //将其他Collection集合转换为HashSet集合
        Collection list = new ArrayList();
        Set hashSet4 = new HashSet(list);
    }
}
