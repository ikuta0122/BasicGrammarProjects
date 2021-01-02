package com.ikuta.map.Hashtable;

import java.util.Properties;

//Properties集合继承Hashtable集合
public class HashtableDemo05 {
    public static void main(String[] args) {
        Properties properties = new Properties();
        //添加键值对
        properties.setProperty("中国", "东八区");
        properties.setProperty("日本", "东七区");
        properties.setProperty("韩国", "东七区");
        //获取键值对
        System.out.println("韩国的时区:" + properties.getProperty("韩国"));
    }
}
