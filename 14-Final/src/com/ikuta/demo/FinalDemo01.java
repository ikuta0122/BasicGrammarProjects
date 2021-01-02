package com.ikuta.demo;

public class FinalDemo01 {
    //情景1：final修饰的变量 -->final修饰的局部变量，只能赋一次值。
    //声明和赋值变量,并使用final修饰
    static final int i = 100;
    //i = 200;//报错:Cannot assign a value to final variable 'i'

    public static void main(String[] args) {
        System.out.println(i);
    }
}

//情景2:final修饰的类 -->final修饰的类无法被继承
final class A {
}
//class B extends A {}//报错:Cannot inherit from final 'com.ikuta.demo.A'

//情景3:final修饰的方法-->final修饰的方法无法覆盖
class C {
    public final void doSome() {
        System.out.println("C's doSome execute");
    }
}

class D extends C {
    //public void doSome() {}//报错:doSome()' cannot override 'doSome()' in 'com.ikuta.demo.C'; overridden method is final
}