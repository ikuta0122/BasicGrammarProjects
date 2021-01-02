package com.ikuta.demo;

//思考:为什么要使用包装类?
//结论:基本类型的数据不具备"对象"的特性（没有成员变量和成员方法可以调用）
class MyInt {
    int value;

    public MyInt() {
        super();
    }

    public MyInt(int value) {
        super();
        this.value = value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}

public class IntegerDemo01 {
    public static void doSome(Object obj) {
        System.out.println(obj);
    }

    public static void main(String[] args) {
        //要求:当方法的形参为Object类时,如何传入一个数字?
        //解决:将该数字包装成对象
        MyInt myInt = new MyInt(100);
        doSome(myInt);
    }
}