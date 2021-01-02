package com.ikuta.collection.list.ArrayList;

import java.util.ArrayList;
import java.util.List;

//ArrayList集合的存储元素特点:有序可重复,有下标
public class ArrayListDemo03 {
    public static void main(String[] args) {
        List arrayList = new ArrayList();
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        arrayList.add("a");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
        //a b c a
        //有序  --->存储顺序为a b c a,读取顺序为a b c a
        //可重复--->存储元素允许存在两个值相同[a]的String对象
        //有下标--->存储元素可以通过下标获取
    }
}
