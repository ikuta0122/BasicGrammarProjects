package com.ikuta.test;

//final,finally和finalize的区别
public class ExceptionTest02 {
    public static void main(String[] args) {
        final int i = 100;//final是关键字,表示最终的,不变的

        try {
            System.out.println("try...");
        } finally {//finally是关键字,finally和try联合使用在异常处理机制中
            System.out.println("finally...");//finally语句块中的代码是一定会执行的。
        }

        Student student = new Student();
        student = null;
        System.gc();//finalize()是垃圾回收器GC负责调用
    }
}

class Student {
    @Override
    protected void finalize() throws Throwable {//finalize是标识符,finalize()是Object类中的一个方法
        System.out.println(this + "即将销毁");
    }
}