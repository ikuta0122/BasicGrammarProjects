package com.ikuta.demo;

//测试不同的构造方法创建对象
public class ConstructorDemo03 {
    public static void main(String[] args) {
        Vip v1 = new Vip();
        System.out.println(v1.no);//0
        System.out.println(v1.name);//null
        System.out.println(v1.birth);//null
        System.out.println(v1.sex);//false
        System.out.println();

        Vip v2 = new Vip(2222L, "大灰狼");
        System.out.println(v2.no);
        System.out.println(v2.name);
        System.out.println(v2.birth);//null
        System.out.println(v2.sex);//false
        System.out.println();

        Vip v3 = new Vip(3333L, "小绵羊", "2010/10/10");
        System.out.println(v3.no);
        System.out.println(v3.name);
        System.out.println(v3.birth);
        System.out.println(v3.sex);//false
        System.out.println();

        Vip v4 = new Vip(4444L, "喜羊羊", "2000/01/01", true);
        System.out.println(v4.no);
        System.out.println(v4.name);
        System.out.println(v4.birth);
        System.out.println(v4.sex);
    }
}

class Vip {
    long no;
    String name;
    String birth;
    boolean sex;

    public Vip() {
    }

    public Vip(long no) {
        this.no = no;
    }

    public Vip(long no, String name) {
        this.no = no;
        this.name = name;
    }

    public Vip(long no, String name, String birth) {
        this.no = no;
        this.name = name;
        this.birth = birth;
    }

    public Vip(long no, String name, String birth, boolean sex) {
        this.no = no;
        this.name = name;
        this.birth = birth;
        this.sex = sex;
    }
}