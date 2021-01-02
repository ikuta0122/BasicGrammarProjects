package com.ikuta.collection.list.Vector;

import java.util.*;

//Vector集合的构造方法
public class VectorDemo01 {
    public static void main(String[] args) {
        //创建默认初始化容量的Vector集合
        Vector vector1 = new Vector();
        //创建指定初始化容量的的Vector集合
        Vector vector2 = new Vector(20);
        //创建指定初始化容量和容量增长值的Vector集合
        Vector vector3 = new Vector(10, 10);
        //将其他Collection集合转换为LinkedList集合
        Collection hashSet = new HashSet();
        Vector vector4 = new Vector(hashSet);
    }
}
