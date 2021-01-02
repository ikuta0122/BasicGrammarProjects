package com.ikuta.collection.list.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*ArrayList集合的使用
添加元素
读取元素
删除元素
遍历集合
*/
public class ArrayListDemo02 {
    public static void main(String[] args) {
        List arrayList = new ArrayList();
        //添加元素
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        arrayList.add("d");
        System.out.println("集合元素个数:" + arrayList.size());

        //删除元素
        arrayList.remove("d");
        System.out.println("集合元素个数:" + arrayList.size());

        //读取元素 + 集合遍历
        for (Object obj : arrayList) {
            System.out.print(obj + " ");
        }
        System.out.println();
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
        System.out.println();

        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
