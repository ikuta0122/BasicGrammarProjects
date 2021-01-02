package com.ikuta.DynamicProxy.Details;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//客户端：生成代理实例，并调用了request()方法
public class Client {
    public static void main(String[] args) throws Throwable {
        ISubject target = new SubjectImpl();// 指定被代理类[目标类]
        InvocationHandler handler = new DynamicSubject(target);// 指定调用处理器
        ISubject proxy = (ISubject) Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                handler
        );// 创建代理类并实例化代理类对象

        System.out.println(proxy instanceof Proxy);
        // 输出1:true
        // 结论1:proxy是Proxy的一个实例,且这个实例实现了Subject接口

        System.out.println("proxy的Class类是：" + proxy.getClass().toString());
        // 输出2::proxy的Class类是：class com.sun.proxy.$Proxy0
        // 结论2:proxy的Class类是$Proxy0,且这个$Proxy0类继承了Proxy，实现了Subject接口

        System.out.print("proxy中的属性有：");
        Field[] field = proxy.getClass().getDeclaredFields();
        for (Field f : field) {
            System.out.print(f.getName() + ", ");
        }
        // 输出3:proxy中的属性有：m1, m2, m3, m0

        System.out.print("\n" + "proxy中的方法有：");
        Method[] method = proxy.getClass().getDeclaredMethods();
        for (Method m : method) {
            System.out.print(m.getName() + ", ");
        }
        // 输出4:proxy中的方法有：equals, toString, hashCode, request,

        System.out.print("\n" + "proxy的父类是：" + proxy.getClass().getSuperclass());
        // 输出5:proxy的父类是：class java.lang.reflect.Proxy

        System.out.print("\n" + "proxy实现的接口是：");
        Class<?>[] interfaces = proxy.getClass().getInterfaces();
        for (Class<?> i : interfaces) {
            System.out.println(i.getName() + ", ");
        }
        // 输出6:subject实现的接口是：com.ikuta.services.ISubject,

        proxy.request();
		/* 输出7
		before calling public abstract void com.ikuta.services.ISubject.request()
		From SubjectImpl
		after calling public abstract void com.ikuta.services.ISubject.request()
		*/
    }
}