package com.ikuta.DynamicProxy.EnhanceFunction;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class MyTest {
    public static void main(String[] args) {
        //情景1:不使用动态代理
        HelloImpl_Former former = new HelloImpl_Former();
        int result1 = former.print("因不能修改目标对象的方法而无法得到期望值");
        System.out.println("result1 =" + result1);
        //情景2:使用动态代理
        HelloImpl_Former latter = new HelloImpl_Former();
        InvocationHandler handler = new MyInvocationHandler(latter);
        IHello proxy = (IHello) Proxy.newProxyInstance(
                latter.getClass().getClassLoader(),
                latter.getClass().getInterfaces(),
                handler
        );
        int result2 = proxy.print("在不修改目标对象的方法上得到期望值");
        System.out.println("result2 =" + result2);

    }
}