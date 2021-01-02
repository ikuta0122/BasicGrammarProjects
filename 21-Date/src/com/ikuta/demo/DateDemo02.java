package com.ikuta.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//将规定格式的字符串对象转换为Date对象
public class DateDemo02 {
    public static void main(String[] args) throws ParseException {
        String str = "2008-08-08 08:08:08 888";
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        Date time = dateFormat.parse(str);
        System.out.println(time);
    }
}
