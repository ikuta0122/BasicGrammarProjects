package com.ikuta.demo;

//分析没有使用Enum类的程序存在什么缺陷?
//程序设计上存在缺陷:如果结果只有两种情况,那么应该使用boolean类型而非int类型
public class EnumDemo01 {
    public static void main(String[] args) {
        int retValue1 = ifDivideBefore(10, 2);
        System.out.println(retValue1 != 0 ? true : false);

        boolean retValue2 = ifDivideAfter(10, 2);
        System.out.println(retValue2);
    }

    public static int ifDivideBefore(int a, int b) {
        try {
            int i = a / b;
            return 1;
        } catch (Exception e) {
            return 0;
        }
    }

    public static boolean ifDivideAfter(int a, int b) {
        try {
            int i = a / b;
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}