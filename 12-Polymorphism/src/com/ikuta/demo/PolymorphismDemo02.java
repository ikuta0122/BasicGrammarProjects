package com.ikuta.demo;

//instanceof的实际作用
public class PolymorphismDemo02 {
    //main方法程序员A编写
    public static void main(String[] args) {
        Test at = new Test();
        at.test(new Cat());
        at.test(new Bird());
    }
}

class Test {
    //test方法程序员B编写
    public void test(Animal a) {
		/*
		test方法的参数是Animal，而这个方法可能会被其他人调用，
		对于使用这来说，不知道传过来的a是什么类型的，
		可能是Animal，可能是Cat，也可能是Bird，
		这种时候就要instanceof来判断了。
		*/
        if (a instanceof Cat) {
            Cat c = (Cat) a;
            c.catchMouse();
        } else if (a instanceof Bird) {
            Bird b = (Bird) a;
            b.sing();
        }
    }
}