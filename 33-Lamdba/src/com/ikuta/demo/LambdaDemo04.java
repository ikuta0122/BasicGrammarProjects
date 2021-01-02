package com.ikuta.demo;

/**
 * 推导lambda表达式:匿名内部类
 */
public class LambdaDemo04 {
    public static void main(String[] args) {
        ILike like = new ILike() {
            @Override
            public void lambda() {
                System.out.println("匿名内部类");
            }
        };
        like.lambda();
    }
}
