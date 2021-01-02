package com.ikuta.demo;

//finally语句中的代码会不会执行
public class ExceptionDemo12 {
    public static void main(String[] args) {
        try {
            System.out.println("try语句块");
            System.exit(0);
        } finally {
            System.out.println("finally语句块");
        }
    }
}