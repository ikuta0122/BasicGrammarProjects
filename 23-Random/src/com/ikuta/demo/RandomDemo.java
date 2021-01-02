package com.ikuta.demo;

import java.util.Random;

//生成一个随机数
public class RandomDemo {
    public static void main(String[] args) {
        Random random = new Random();
        int num1 = random.nextInt();
        System.out.println(num1);

        int num2 = random.nextInt(101);//生成[0，bound-1]之间的随机数
        System.out.println(num2);
    }
}