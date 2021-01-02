package com.ikuta.classandobject.test.test01;

//1.设计日期类，每个日期对象都可以描述年日月信息
public class Date {
    int year;
    int month;
    int day;

    public Date() {
        year = 2000;
        month = 1;
        day = 1;
    }

    public Date(int x, int y, int z) {
        year = x;
        month = y;
        day = z;
    }
}