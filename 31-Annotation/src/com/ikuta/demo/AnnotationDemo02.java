package com.ikuta.demo;

//关于@Override注解
public class AnnotationDemo02 {
    /**
     * 关于@Override注解
     *
     * @Override注解只能出现在方法上,表示当前方法已经重写
     * @Override注解属于标志性注解
     * @Override注解只作用于编译阶段[编译器检测到方法不是重写方法时报错]
     */
    @Override
    public String toString() {
        return "toString";
    }
}