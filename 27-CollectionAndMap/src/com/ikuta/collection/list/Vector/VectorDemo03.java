package com.ikuta.collection.list.Vector;

import java.util.List;
import java.util.Vector;

//Vector集合的存储元素特点:有序可重复,有下标
public class VectorDemo03 {
    public static void main(String[] args) {
        List vector = new Vector();
        vector.add("a");
        vector.add("b");
        vector.add("c");
        vector.add("a");
        for (int i = 0; i < vector.size(); i++) {
            System.out.print(vector.get(i) + " ");
        }
        //a b c a
        //有序  --->存储顺序为a b c a,读取顺序为a b c a
        //可重复--->存储元素允许存在两个值相同[a]的String对象
        //有下标--->存储元素可以通过下标获取
    }
}