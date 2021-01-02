package com.ikuta.demo;

//异常的第二种处理方式:异常捕捉
public class ExceptionDemo04 {
    public static void main(String[] args) {
        // doSome();//报错:Unhandled exception: java.lang.ClassNotFoundException
        try {
            doSome();// 编译时异常需要预处理[异常捕捉]
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * @throws ClassNotFoundException 属于编译时异常
     */
    public static void doSome() throws ClassNotFoundException {
        System.out.println("doSome execute!!!");
    }
}
