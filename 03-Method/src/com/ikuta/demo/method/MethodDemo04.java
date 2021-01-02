package com.ikuta.demo.method;

/*
"类名."什么时候可以省略？在同一个类中
a()方法调用b()方法时,
    如果两个方法  在同一个类中,"类名."  可以省略;
    如果两个方法不在同一个类中,"类名."不可以省略;
最好不要省略,防止出错!!!
*/
public class MethodDemo04 {
    public static void println3() {
        System.out.println("口口相传的java黄埔军校");
    }

    public static void main(String[] args) {
        //如果两个方法  在同一个类中,"类名."  可以省略;
        println1();
        println2();
        println3();

        //如果两个方法不在同一个类中,"类名."不可以省略;
        Mycalss.println1();
        Mycalss.println2();
        Mycalss.println3();
    }

    public static void println1() {
        System.out.println("Hello World");
    }

    public static void println2() {
        System.out.println("动力节点");
    }
}

class Mycalss {
    public static void println1() {
        System.out.println("myclass");
    }

    public static void println2() {
        System.out.println("myclass");
    }

    public static void println3() {
        System.out.println("myclass");
    }
}