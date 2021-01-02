package com.ikuta.demo;

/**
 * 推导lambda表达式:静态内部类
 */
public class LambdaDemo02 {
    static class Like implements ILike {
        @Override
        public void lambda() {
            System.out.println("静态内部类");
        }
    }

    public static void main(String[] args) {
        ILike like = new Like();
        like.lambda();
    }
}
