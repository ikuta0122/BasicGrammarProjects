package com.ikuta.demo;

/**
 * 推导lambda表达式:局部内部类
 */
public class LambdaDemo03 {
    public static void main(String[] args) {
        class Like implements ILike {
            @Override
            public void lambda() {
                System.out.println("局部内部类");
            }
        }
        ILike like = new Like();
        like.lambda();
    }
}
