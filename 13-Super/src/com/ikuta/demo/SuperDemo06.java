package com.ikuta.demo;

//测试:super的性质
/*System.out.println(super);报错需要'.'
1.super不是引用
2.super不保存内存地址
3.super不指向任何对象
4.super只是代表当前对象内部的父类型特征
*/
public class SuperDemo06 {
    public void doSome() {
        System.out.println(this);//相当于System.out.println(this.toString());
        System.out.println(super.toString());
    }

    public static void main(String[] args) {
        SuperDemo06 st = new SuperDemo06();
        st.doSome();
    }
}