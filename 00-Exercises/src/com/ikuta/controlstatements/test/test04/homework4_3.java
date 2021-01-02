package com.ikuta.controlstatements.test.test04;

/*
3.计算5的阶乘
*/
public class homework4_3 {
    public static void main(String[] args) {
        int jieCheng = 1;
        for (int i = 5; i > 1; i--) {
            jieCheng *= i;
        }
        System.out.println("5的阶乘是" + jieCheng);
    }
}