package com.ikuta.demo;

//Integer类的常用方法
public class IntegerDemo06 {
    public static void main(String[] args) {
        // 1.int intValue()返回一个int类型的数值
        Integer x = new Integer(1000);
        int value = x.intValue();
        System.out.println(value);

        // 2.static int parseInt(String s)String转换成int
        System.out.println(Integer.parseInt("132") + 201);

        // 3.static String toBinaryString(int i)将十进制的int类型数值转换成二进制的字符串
        System.out.println(Integer.toBinaryString(3));

        // 4.static String toHexString(int i)将十进制的int类型数值转换成十六进制的字符串
        System.out.println(Integer.toHexString(32));

        // 5.static String toOctalString(int i)将十进制的int类型数值转换成八进制的字符串
        System.out.println(Integer.toOctalString(8));

        // 6.valueOf()将int或者String类型的变量转换成Integer类型
        System.out.println(Integer.valueOf(100));
        System.out.println(Integer.valueOf("200"));
        System.out.println(Integer.valueOf("101", 2));
    }
}
