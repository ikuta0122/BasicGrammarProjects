package com.ikuta.collection.set.TreeSet;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*TreeSet集合的使用
添加元素
读取元素
删除元素
遍历集合
*/
public class TreeSetDemo02 {
    public static void main(String[] args) {
        Set treeSet = new TreeSet();
        //添加元素
        treeSet.add("a");
        treeSet.add("b");
        treeSet.add("c");
        treeSet.add("d");
        System.out.println("集合元素个数:" + treeSet.size());

        //删除元素
        treeSet.remove("d");
        System.out.println("集合元素个数:" + treeSet.size());

        //读取元素 + 集合遍历
        for (Object obj : treeSet) {
            System.out.print(obj + " ");
        }
        System.out.println();
        Iterator iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}