package com.ikuta.demo;

//测试:静态变量的访问方式[引用./类名.]
//测试:静态变量是否会出现"空指针异常"[空指针异常只会发生在"空引用"访问"实例相关数据"的场景]
public class StaticDemo03 {
    public static void main(String[] args) {
        //静态变量的访问方式[引用./类名.]
        System.out.println(English.country);
        English c1 = new English();
        System.out.println(c1.country);

        //静态变量是否会出现"空指针异常"
        c1 = null;
        System.out.println(c1.country);//相当于System.out.println(Chinese.country);
        //结论:不会,因为空指针异常只会发生在"空引用"访问"实例相关数据"的场景
    }
}

class English {
    String idCard;
    String name;
    static String country = "英国";

    public English() {
    }

    public English(String s1, String s2) {
        idCard = s1;
        name = s2;
    }
}