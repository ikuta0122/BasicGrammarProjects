package com.ikuta.demo.method;

//测试:调用方法时是否可以省略变量？可以
public class MethodDemo09 {
    public static void main(String[] args) {
        //调用sum()方法
        int jieGuo = MethodDemo09.sum(10, 20);
        System.out.println(jieGuo);
        //合并上面两行代码
        System.out.println(MethodDemo09.sum(100, 200));

        //调用m()方法
        boolean flag = m();
        if (flag) {
            System.out.println("真的");
        } else {
            System.out.println("假的");
        }
        //合并上面六行代码
        if (m()) {
            System.out.println("真的");
        } else {
            System.out.println("假的");
        }
        //if分支语句改为条件运算符
        System.out.println(m() ? "真的" : "假的");
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static boolean m() {
        return true;
    }
}