package com.ikuta.StaticProxy;


public class Client_Static {
    public static void main(String[] args) {
        // 实例化代理类对象
        UsbSellProxy_Static taoBao = new UsbSellProxy_Static(new UsbSellTarget_Static());
        // 调用代理类对象的方法实现功能
        float price = taoBao.sell(1);
        System.out.println("通过淘宝的商家，购买u盘单价：" + price);
    }
}