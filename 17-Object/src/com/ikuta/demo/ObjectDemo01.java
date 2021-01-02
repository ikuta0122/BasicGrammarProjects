package com.ikuta.demo;

//重写equals()方法
public class ObjectDemo01 {
    public static void main(String[] args) {
        MyTime mt1 = new MyTime(2008, 8, 8);
        MyTime mt2 = new MyTime(2008, 8, 8);
        MyTime mt3 = new MyTime(1994, 5, 25);
        // 情景1:使用==判断mt1和mt2的内容是否相等
        // System.out.println(mt1 == mt2);false[因为==判断的是引用存储的内存地址]

        // 情景2:重写equals()方法
        System.out.println(mt1.equals(mt2));//true
        System.out.println(mt1.equals(mt3));//false
    }
}

class MyTime {
    private int year;
    private int month;
    private int day;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public MyTime() {
        super();
    }

    public MyTime(int year, int month, int day) {
        super();
        this.year = year;
        this.month = month;
        this.day = day;
    }

    // 当年月日相同，表示两个日期相同，即两个对象相同。
    public boolean equals(Object obj) {
        // 如果obj是空，直接返回false
        // 如果obj不是一个MyTime，没必要比较，直接返回false
        if (obj == null || !(obj instanceof MyTime)) {
            return false;
        }
        // 如果obj保存的内存地址就是this，没必要比较，直接返回true
        if (obj == this) {
            return true;
        }
        MyTime time = (MyTime) obj;
        return this.year == time.year && this.month == time.month && this.day == time.day;
    }
}