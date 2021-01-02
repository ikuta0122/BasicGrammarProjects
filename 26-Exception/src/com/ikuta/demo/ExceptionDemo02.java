package com.ikuta.demo;

//异常的存在形式
public class ExceptionDemo02 {
    public static void main(String[] args) {
        // 通过"异常类"实例化"异常对象"
        NumberFormatException nfe = new NumberFormatException("数字格式化异常发生!!!");
        System.out.println(nfe);
        // 输出:java.lang.NumberFormatException: 数字格式化异常

        // 通过"异常类"实例化"异常对象"
        NullPointerException npe = new NullPointerException("空指针异常发生!!!");
        System.out.println(npe);
        // 输出:java.lang.NullPointerException: 空指针异常发生!!!
    }
}
