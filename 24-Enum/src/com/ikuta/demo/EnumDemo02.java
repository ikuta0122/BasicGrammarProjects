package com.ikuta.demo;

//使用枚举的方式改造程序
public class EnumDemo02 {
    public static void main(String[] args) {
        Result r1 = divide(10, 5);
        System.out.println(r1 == Result.FAIL ? "计算失败" : "计算成功");
        Result r2 = divide(10, 0);
        System.out.println(r2 == Result.FAIL ? "计算失败" : "计算成功");
    }

    public static Result divide(int a, int b) {
        try {
            int c = a / b;
            return Result.SUCCESS;
        } catch (Exception e) {
            return Result.FAIL;
        }
    }
}

enum Result {
    SUCCESS, FAIL
}