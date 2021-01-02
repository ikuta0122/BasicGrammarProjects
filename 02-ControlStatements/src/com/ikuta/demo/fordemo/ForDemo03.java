package com.ikuta.demo.fordemo;

public class ForDemo03 {
    public static void main(String[] args){
        //for循环的练习1
        for (int i = 10; i > 0 ; i--){
            System.out.println("value1=" + i);
            //10 9 8 ... 1
        }
        System.out.println("\n");
        //for循环的练习2
        for (int i = 0; i < 10 ; i+=2){
            System.out.println("value2=" + i);
            //0 2 4 6 8
        }
        System.out.println("\n");
        //for循环的练习3
        for (int i = 100; i > 0 ; i %= 3){
            System.out.println("value3=" + i);
            //100 1 1 ...死循环了
        }
    }
}
