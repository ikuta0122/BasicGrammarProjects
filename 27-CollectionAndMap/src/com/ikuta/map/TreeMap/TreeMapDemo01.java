package com.ikuta.map.TreeMap;

import java.util.*;

//TreeMap集合的构造方法
public class TreeMapDemo01 {
    public static void main(String[] args) {
        //创建一个空的TreeMap集合
        Map<Integer, String> treeMap1 = new TreeMap<>();

        //将其他Map转换为TreeMap集合
        Map<Integer, String> map = new HashMap<>();
        Map<Integer, String> treeMap2 = new TreeMap<>(map);

        //创建指定比较规则的TreeMap集合
        Map<Ninja, String> treeMap3 = new TreeMap<>(new NinjaComparator());
    }
}

class Ninja {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ninja ninja = (Ninja) o;
        return age == ninja.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age);
    }
}

class NinjaComparator implements Comparator<Ninja> {
    @Override
    public int compare(Ninja o1, Ninja o2) {
        return o1.getAge() - o2.getAge();
    }
}