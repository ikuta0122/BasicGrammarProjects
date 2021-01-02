package com.ikuta.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 第四步:创建代理对象并把返回值转为接口类型
 * 第五步:通过代理对象执行业务方法
 */
public class Client_Dynamic {
    public static void main(String[] args) {
        // 1. 创建目标对象
        IUsbSell_Dynamic target = new UsbSellTarget_Dynamic();
        // 2.创建调用处理器对象
        InvocationHandler handler = new UsbSellHandler_Dynamic(target);
        // 3.创建JDK动态代理对象
        IUsbSell_Dynamic proxy = (IUsbSell_Dynamic) Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                handler
        );
        /*
         *System.out.println("proxy:" + proxy.getClass().getName());
         *输出:com.sun.proxy.$Proxy0
         *结论:proxy是$Proxy0类的一个实例,并且该实例实现了目标接口
         */

        // 4.通过代理对象执行业务方法
        float price = proxy.sell(1);
		System.out.println("通过动态代理对象，调用方法：" + price);
		/*执行顺序
         *第一步:通过代理对象proxy执行业务方法sell(1)
         *第二步:执行InvocationHandler接口的实现类UsbSellHandler_Dynamic中的目标方法invoke()方法
         *第三步:返回结果给price变量
         *注意:通过调用处理器类截取目标方法
         */
    }
}
