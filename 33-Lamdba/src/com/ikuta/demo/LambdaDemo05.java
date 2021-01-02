package com.ikuta.demo;

/**
 * 推导Lambda表达式:Lambda表达式
 */
public class LambdaDemo05 {
    public static void main(String[] args) {
        ILike like = () -> {
            System.out.println("Lambda表达式");
        };
        like.lambda();
    }
}
