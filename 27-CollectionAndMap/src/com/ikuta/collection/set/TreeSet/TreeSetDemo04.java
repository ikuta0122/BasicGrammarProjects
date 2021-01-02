package com.ikuta.collection.set.TreeSet;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

//实现TreeSet自动排序的第一种方式:实现Comparable接口,重写compareTo()方法
public class TreeSetDemo04 {
    public static void main(String[] args) {
        Set<Idol> idols = new TreeSet<>();
        idols.add(new Idol(26, "nishino"));
        idols.add(new Idol(26, "hashimoto"));
        idols.add(new Idol(22, "hoshino"));
        idols.add(new Idol(23, "ikuta"));
        for (Idol idol : idols) {
            System.out.println(idol);
        }
    }
}

class Idol implements Comparable<Idol> {
    int age;
    String name;

    public Idol() {
        super();
    }

    public Idol(int age, String name) {
        super();
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Idol [age=" + age + ", name=" + name + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Idol idol = (Idol) o;
        return age == idol.age && Objects.equals(name, idol.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

    /**
     * 比较规则:先比较年龄在比较姓名
     */
    @Override
    public int compareTo(Idol idol) {
        if (this.age != idol.age) {
            return this.age - idol.age;
        } else {
            return this.name.compareTo(idol.name);
        }
    }
}
