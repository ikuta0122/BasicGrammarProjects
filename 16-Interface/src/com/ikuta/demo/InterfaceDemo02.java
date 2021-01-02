package com.ikuta.demo;

/*接口的基础语法
1.类和类之间叫做继承，类和接口之间叫做实现。
	继承使用extends关键字完成
	实现使用implements关键字完成
2.一个非抽象类实现接口,必须实现接口中的所有方法
*/
public class InterfaceDemo02 {
    public static void main(String[] args) {
        //情景1:接口是否可以实例化?
        //MyMath1 abc = new MyMath1();
        //报错:'MyMath1' is abstract; cannot be instantiated

        //情景2:多态机制和接口的联合使用
        MyMath1 mm = new ABC();
        System.out.println(mm.sum(8, 1));//9
        System.out.println(mm.sub(8, 1));//7
    }
}

//特殊的抽象类，完全抽象，叫做接口
interface MyMath1 {
    int sum(int a, int b);

    int sub(int a, int b);

    double PI = 3.1415926;
}

//一个非抽象类实现接口,必须实现接口中的所有方法
class ABC implements MyMath1 {
    public int sum(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }
}