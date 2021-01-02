package com.ikuta.demo;

//重写toString()方法
public class OverrideDemo04 {
    public static void main(String[] args) {
        MyTime time = new MyTime();
        System.out.println(time);
        //重写toString()方法之前的结果：MyTime@5caf905d
        //重写toString()方法之后的结果：1970年1月1日
    }
}

class MyTime {
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

    public MyTime() {
        this(1970, 1, 1);
    }

    public MyTime(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    //重写toString()方法
    public String toString() {
        return year + "年" + month + "月" + day + "日";
    }
}