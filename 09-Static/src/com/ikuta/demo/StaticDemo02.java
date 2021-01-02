package com.ikuta.demo;

//测试:使用静态变量[节约堆空间内存]
public class StaticDemo02 {
    public static void main(String[] args) {
        //实例变量的访问必须先new对象然后使用“引用.实例变量名”
        American c1 = new American("111111", "张三");
        System.out.println(c1.idCard);
        System.out.println(c1.name);
        //静态变量的访问使用“类名.静态变量名”
        System.out.println(American.country);
    }
}

class American {
    String idCard;//实例变量
    String name;//实例变量
    static String country = "美国";

    public American() {

    }

    public American(String s1, String s2) {
        idCard = s1;
        name = s2;
    }
}