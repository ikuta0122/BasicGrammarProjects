package com.ikuta.demo;

import java.text.DecimalFormat;

//java.text.DecimalFormat专门负责数字格式化
public class NumberDemo01 {
    public static void main(String[] args) {
        DecimalFormat format = new DecimalFormat("###,###.##");//加入千分位,保留两位小数
        String str1 = format.format(1234.56);
        System.out.println(str1);//1,234.56

        DecimalFormat df2 = new DecimalFormat("###,###.0000");//加入千分位,保留四位小数,不够时补0
        String str2 = df2.format(1234.56);
        System.out.println(str2);//1,234.5600
    }
}