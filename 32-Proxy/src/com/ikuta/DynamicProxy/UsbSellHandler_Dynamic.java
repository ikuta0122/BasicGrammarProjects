package com.ikuta.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 第三步:创建InvocationHandler接口的实现类,在invoke()方法中完成代理类的功能
 * 必须实现InvocationHandler接口，完成代理类要做的功能（1.调用目标方法，2.功能增强）
 */
public class UsbSellHandler_Dynamic implements InvocationHandler {
    // 传入目标对象[动态代理的目标对象是活动的,需要传入]
    private Object target;

    public UsbSellHandler_Dynamic(Object target) {
        this.target = target;
    }

    /**
     * invoke()方法由JVM虚拟机动态调用
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 执行目标方法[向厂家发送订单，告诉厂家，我买了u盘，厂家发货]
        Object result = method.invoke(target, args);

        // 功能增强[代理类在完成目标类方法调用后,增强了功能]
        if (result != null) {
            Float price = (Float) result;
            price = price + 25;
            result = price;
        }
        return result;
    }
}