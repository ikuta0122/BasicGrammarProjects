package com.ikuta.demo;

//finally语句中的代码会不会执行
public class ExceptionDemo11 {
    public static void main(String[] args) {
        try {
            System.out.println("try语句块");
            return;
        } finally {
            System.out.println("finally语句块");
        }
    }
}