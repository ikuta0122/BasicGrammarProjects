package com.ikuta.demo;

//重写toString()方法
public class ObjectDemo03 {
    public static void main(String[] args) {
        MyDay myDay = new MyDay(2008, 8, 8);
        //重写toString()方法之后
        System.out.println(myDay);//2008年8月8日
    }
}

class MyDay {
    int year;
    int month;
    int day;

    public MyDay() {
        super();
    }

    public MyDay(int year, int month, int day) {
        super();
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public String toString() {
        return "MyDay{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}
