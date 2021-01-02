package com.ikuta.demo;

//关于@Deprecated注解
public class AnnotationDemo03 {
    public static void main(String[] args) {
        AnnotationDemo03.doSome();
    }

    /**
     * @Deprecated 表示当前程序元素是危险的或者过时的, 建议程序员使用其他元素
     */
    @Deprecated
    public static void doSome() {
        System.out.println("doSome");
    }
}