package com.ikuta.demo;

//实现时间复杂度的事后估计法
public class DateDemo03 {
    public static void doSome(String str) {
        for (int i = 0; i < 1000; i++) {
            str += i;
        }
    }

    public static void main(String[] args) {
        String str = "start";
        long begin = System.currentTimeMillis();
        doSome(str);
        long end = System.currentTimeMillis();
        System.out.println("耗费时长:" + (end - begin) + "毫秒");
    }
}
