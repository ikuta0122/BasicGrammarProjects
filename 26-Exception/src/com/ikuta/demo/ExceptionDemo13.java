package com.ikuta.demo;

//自定义异常类
public class ExceptionDemo13 {
    public static void main(String[] args) {
        MyException e = new MyException("用户名不能为空");
        System.out.println(e.getMessage());//获取异常简单描述信息
        e.printStackTrace();//打印异常堆栈信息
    }
}

class MyException extends Exception {
    public MyException() {
        super();
    }

    public MyException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }

    @Override
    public void printStackTrace() {
        super.printStackTrace();
    }
}