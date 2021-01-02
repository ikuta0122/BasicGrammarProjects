package com.ikuta.demo;

/**
 * 推导lambda表达式:外部类
 */
public class LambdaDemo01 {
    public static void main(String[] args) {
        ILike like = new Like();
        like.lambda();
    }
}

class Like implements ILike {
    @Override
    public void lambda() {
        System.out.println("外部类");
    }
}