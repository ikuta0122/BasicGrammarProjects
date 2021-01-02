package com.ikuta.collection.list.Vector;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/*Vector集合的使用
添加元素
读取元素
删除元素
遍历集合
*/
public class VectorDemo02 {
    public static void main(String[] args) {
        List vector = new Vector();
        //添加元素
        vector.add("a");
        vector.add("b");
        vector.add("c");
        vector.add("d");
        System.out.println("集合元素个数:" + vector.size());

        //删除元素
        vector.remove("d");
        System.out.println("集合元素个数:" + vector.size());

        //读取元素 + 集合遍历
        for (Object obj : vector) {
            System.out.print(obj + " ");
        }
        System.out.println();
        for (int i = 0; i < vector.size(); i++) {
            System.out.print(vector.get(i) + " ");
        }
        System.out.println();

        Iterator iterator = vector.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}