package com.ikuta.demo;

import java.text.SimpleDateFormat;
import java.util.Date;

//Date的构造方法
//计算结果超过int的取值范围[-2147483648,2147483647],需要在参与计算的数值后加L
public class DateDemo04 {
    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");

        // 情景1:获取昨天的此刻时间
        Date time1 = new Date(System.currentTimeMillis() - 1000 * 60 * 60 * 24);
        String strTime1 = dateFormat.format(time1);
        System.out.println(strTime1);

        // 情景2:获取去年的此刻时间
        Date time2 = new Date(System.currentTimeMillis() - 1000L * 60L * 60L * 24L * 366L);//计算结果超过int的取值范围[-2147483648,2147483647],需要在参与计算的数值后加L
        String strTime2 = dateFormat.format(time2);
        System.out.println(strTime2);
    }
}
