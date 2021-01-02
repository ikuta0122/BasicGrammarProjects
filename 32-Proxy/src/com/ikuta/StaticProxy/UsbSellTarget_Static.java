package com.ikuta.StaticProxy;


//第二步:创建目标类,实现接口
//例如:金士顿厂家(不接受用户的单独购买。)
public class UsbSellTarget_Static implements IUsbSell_Static {
    /**
     * 一个128G的u盘是 85元。
     * 后期根据amount,可以实现不同的价格
     * 例如10000个的单价是80, 50000个的单价是75
     */
    @Override
    public float sell(int amount) {
        return 85.0f;
    }
}
