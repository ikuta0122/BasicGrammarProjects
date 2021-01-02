package com.ikuta.demo.method;

//这个程序是一个体验程序，体验一下方法的好处。
public class MethodDemo02 {
    public static void main(String[] args) {
        //需求1:编写程序,计算100和200的求和
        sumInt(100, 200);
        //需求2:编写程序,计算666和888的求和
        sumInt(666, 888);
    }

    //专门在这个类体当中定义一个方法，这个方法专门用来求和。
    //x y z在以下的sumInt方法中都属于局部变量
    //局部变量有一个特点：方法结束之后，局部变量占用的内存会自动释放。
    public static void sumInt(int x, int y) {
        int z = x + y;
        System.out.println(x + "+" + y + "=" + z);
    }
}