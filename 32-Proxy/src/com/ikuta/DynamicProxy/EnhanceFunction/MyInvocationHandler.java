package com.ikuta.DynamicProxy.EnhanceFunction;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {
    private Object target;

    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    /**
     * 通过invoke()方法实现功能增强
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(target, args);
        if (result != null) {
            Integer num = (Integer) result;
            result = num * 10;
        }
        return result;
    }
}