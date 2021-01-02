package com.ikuta.demo;

interface Computer {
    int sum(int a, int b);
}

class ComputerImplements implements Computer {
    public int sum(int a, int b) {
        return a + b;
    }
}

class MyMath {
    public void mySum(Computer c, int x, int y) {
        System.out.println(x + "+" + y + "=" + c.sum(x, y));
    }
}

//如果方法的实参为接口,需要如何传入实参
//方案一:使用接口实现类
//方案二:使用匿名内部类
public class AnonymousClassesDemo01 {
    public static void main(String[] args) {
        MyMath mm = new MyMath();
		//方案一:使用接口实现类
        mm.mySum(new ComputerImplements(), 100, 200);
		//方案二:使用匿名内部类
        mm.mySum(new Computer() {
            public int sum(int a, int b) {
                return a + b;
            }
        }, 100, 200);
    }

    //静态内部类
    static class Inner01 {
    }

    //实例内部类
    class Inner02 {
    }

    public void doSome() {
        //局部内部类
        class Inner03 {
        }
    }
}