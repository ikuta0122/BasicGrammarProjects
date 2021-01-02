package com.ikuta.DynamicProxy.EnhanceFunction;

/**
 * 他人写好的实现类,但是没有权限修改
 * 当需要的返回值为设定值的10倍时,该如何处理?
 */
public class HelloImpl_Former implements IHello {
    @Override
    public int print(String name) {
        return 2;
    }
}
