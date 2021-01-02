package com.ikuta.demo;

import java.math.BigDecimal;

//java.math.BigDecimal专门负责高准度数字计算
public class NumberDemo02 {
    public static void main(String[] args) {
        BigDecimal value1 = new BigDecimal(100);
        BigDecimal value2 = new BigDecimal(200);
        // 求和--->需要调用add()方法
        System.out.println(value1.add(value2));
        // 求差--->需要调用subtract()方法
        System.out.println(value1.subtract(value2));
        // 求积--->需要调用multiply()方法
        System.out.println(value1.multiply(value2));
        // 求商--->需要调用divide()方法
        System.out.println(value1.divide(value2));
        // 求余--->需要调用remainder()方法
        System.out.println(value1.remainder(value2));
    }
}
