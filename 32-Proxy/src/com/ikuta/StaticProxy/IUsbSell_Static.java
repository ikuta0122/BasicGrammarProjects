package com.ikuta.StaticProxy;

//第一步:创建接口,定义方法
public interface IUsbSell_Static {
    /**
     * @param amount 购买数量
     * @return U盘单价
     */
    float sell(int amount);
}

