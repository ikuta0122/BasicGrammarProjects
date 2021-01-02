package com.ikuta.demo;

//如何重写equals()方法和toString()方法
public class ObjectDemo04 {
    public static void main(String[] args) {
        Student s1 = new Student(1000, "北京大学");
        Student s2 = new Student(1000, "北京大学");
        System.out.println(s1);
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}

class Student {
    int no;// 学号
    String school;// 学校

    public Student() {
        super();
    }

    public Student(int no, String school) {
        super();
        this.no = no;
        this.school = school;
    }

    @Override // 重写toString方法
    public String toString() {
        return "学号：" + no + ", 学校：" + school;
    }

    @Override // 重写equals方法:当学号和学校相等时，表示同一个学生
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Student)) {
            return false;
        }
        Student other = (Student) obj;
        return this.no == other.no && this.school.equals(other.school);
    }
}