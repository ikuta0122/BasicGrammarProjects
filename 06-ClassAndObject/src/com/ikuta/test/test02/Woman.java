package com.ikuta.test.test02;

/*
2.	设计男人类，每个男人都有身份证号、姓名、性别、女人
	设计女人类，每个女人都有身份证号、姓名、性别、男人
*/
public class Woman {
    String no;
    String name;
    static boolean sex = false;
    Man man;

    public Woman() {

    }

    public Woman(String a, String b, boolean c, Man d) {
        no = a;
        name = b;
        sex = c;
        man = d;
    }
}