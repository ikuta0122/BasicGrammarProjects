package com.ikuta.demo;

//this的构造方法复用
public class ThisDemo04 {
    public static void main(String[] args) {
        ////调用无参数构造方法
        Date date1 = new Date();
        date1.printDate();
        ////调用有参数构造方法
        Date date2 = new Date(2008, 8, 8);
        date2.printDate();
    }
}

/*
要求1：定义一个日期类：可以表示年月日信息
要求2：提供无参数构造方法，默认参数为1970年1月1日
要求3：提供有参数构造方法
要求4：提供一个可以打印日期的方法
*/
class Date {
    private int year;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    private int month;

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    private int day;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public Date() {
        this(1970, 1, 1);
    }

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void printDate() {
        System.out.println(year + "年" + month + "月" + day + "日");
    }
}