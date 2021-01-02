package com.ikuta.demo;

import java.text.SimpleDateFormat;
import java.util.Date;

//获取系统当前时间并将其转换为规定格式的字符串
public class DateDemo01 {
    public static void main(String[] args) throws Exception {
        //1.获取系统当前时间(精确到毫秒的系统当前时间)
        Date systemTime = new Date();

        //2.将其转换为规定格式的字符串
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String time = dateFormat.format(systemTime);
        System.out.println(time);
    }
}