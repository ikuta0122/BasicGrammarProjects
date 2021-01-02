package com.ikuta.demo;

/*接口
1.接口属于引用数据类型。
2.接口属于特殊的抽象类[抽象类是半抽象的,而接口是完全抽象的]
3.接口的定义
    [修饰符列表] interface 接口名{
    }
4.接口支持多继承[一个接口可以继承多个接口]
5.接口中的元素只有常量和抽象方法
    接口中所有的元素都是由public修饰的
    接口中常量的public static final可以省略
    接口中抽象方法的public abstract可以省略
*/
public class InterfaceDemo01 {
    public static void main(String[] args) {
        System.out.println(MyMath.PI1);
    }
}

interface MyMath {
    //抽象方法
    public abstract int sum1(int a, int b);

    //接口中抽象方法的public abstract可以省略
    int sum2(int a, int b);

    //常量
    public static final double PI1 = 3.1415926;
    //接口中常量的public static final可以省略
    double PI2 = 3.1415926;
}

//定义接口
interface A {
}

//接口支持继承
interface B extends A {
}

//接口支持多继承,一个接口可以继承多个接口
interface C extends A, B {
}