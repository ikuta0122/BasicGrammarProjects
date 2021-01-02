package com.ikuta.StaticProxy;

//第三步:创建代理类,实现接口并且引入目标类对象
//例如:TaoBao是一个商家，代理金士顿u盘的销售。
public class UsbSellProxy_Static implements IUsbSell_Static {

    // 引入目标类对象
    private UsbSellTarget_Static target;

    public UsbSellProxy_Static() {
    }

    public UsbSellProxy_Static(UsbSellTarget_Static target) {
        this.target = target;
    }

    /**
     * 实现销售u盘功能
     */
    @Override
    public float sell(int amount) {
        // 厂家的价格
        float price = target.sell(amount);
        // 商家需要加价， 也就是代理要增加价格。
        // 增强功能，代理类在完成目标类方法调用后，增强了功能。
        price = price + 25;

        // 增加的价格
        return price;
    }
}
