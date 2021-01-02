package com.ikuta.demo;

/*类与接口的实现问题
类与接口支持多实现
这一机制弥补了java中单继承带来的缺陷
一个类可以同时实现多个接口
*/
/*接口的类型转换问题
如果两个接口存在被同一个类实现,那么这两个接口之间可以实现强制类型转换
如果两个接口没有被同一个类实现,那么这两个接口之间虽然可以强制类型转换,但是会出现ClassCastException类型转换异常
*/
public class InterfaceDemo03 {
    public static void main(String[] args) {
        //情景1:类与接口的实现问题
        M1 a = new D();
        M2 b = new D();
        M3 c = new D();
        a.m1();//m1 execute!!!
        b.m2();//m2 execute!!!
        c.m3();//m3 execute!!!

        //情景2:接口的类型转换问题
        M2 x = (M2) a; //引用通过强制类型转换调用接口M2的m2()方法
        x.m2();//m2 execute!!!
    }
}

interface M1 {
    void m1();
}

interface M2 {
    void m2();
}

interface M3 {
    void m3();
}

class D implements M1, M2, M3 {
    public void m1() {
        System.out.println("m1 execute!!!");
    }

    public void m2() {
        System.out.println("m2 execute!!!");
    }

    public void m3() {
        System.out.println("m3 execute!!!");
    }
}