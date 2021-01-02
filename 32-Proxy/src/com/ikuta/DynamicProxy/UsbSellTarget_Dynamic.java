package com.ikuta.DynamicProxy;


/**
 * 创建目标类实现接口
 */
public class UsbSellTarget_Dynamic implements IUsbSell_Dynamic {
    // 目标方法
    @Override
    public float sell(int amount) {
        return 85.0f;
    }

}
