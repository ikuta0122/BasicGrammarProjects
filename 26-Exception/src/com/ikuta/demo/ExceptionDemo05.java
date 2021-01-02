package com.ikuta.demo;

//异常的处理方式 = 异常上抛 + 异常捕捉
public class ExceptionDemo05 {
    public static void main(String[] args) throws ClassNotFoundException {
        //异常上抛
        doOther();

        //异常捕捉
        try {
            doSome();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void doSome() throws ClassNotFoundException {
        System.out.println("doSome execute!!!");
    }

    public static void doOther() throws ClassNotFoundException {
        System.out.println("doOther execute!!!");
    }
}
