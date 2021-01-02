package com.ikuta.map.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

//HashMap集合中的key类型需要重写hashCode()方法和equals()方法
class Teacher {
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher() {
    }

    public Teacher(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return Objects.equals(name, teacher.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

public class HashMapDemo04 {
    public static void main(String[] args) {
        Map<Teacher, String> teacherMap = new HashMap<>();
        Teacher teacher = new Teacher("张三");
        teacherMap.put(teacher, "北京大学");
        teacherMap.put(teacher, "18260082657");
        System.out.println("Map集合的元素个数 : " + teacherMap.size());
    }
}
