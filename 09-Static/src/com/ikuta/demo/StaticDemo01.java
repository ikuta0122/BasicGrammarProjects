package com.ikuta.demo;

//测试:不使用静态变量的场景[造成内存浪费]
public class StaticDemo01 {
    public static void main(String[] args) {
        Chinese c1 = new Chinese("111111", "张三", "中国");
        System.out.println(c1.idCard);
        System.out.println(c1.name);
        System.out.println(c1.country);
        Chinese c2 = new Chinese("222222", "李四", "中国");
        System.out.println(c2.idCard);
        System.out.println(c2.name);
        System.out.println(c2.country);
    }
}

class Chinese {
    String idCard;//实例变量
    String name;//实例变量
    String country;//实例变量

    public Chinese() {

    }

    public Chinese(String s1, String s2, String s3) {
        idCard = s1;
        name = s2;
        country = s3;
    }
}