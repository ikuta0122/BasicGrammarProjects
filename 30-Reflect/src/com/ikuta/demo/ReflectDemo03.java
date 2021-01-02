package com.ikuta.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

//验证反射机制的灵活性[在不改变程序的基础上在运行阶段实例化不同类型的对象]
public class ReflectDemo03 {
    public static void main(String[] args) {
        File file = new File("src/com/ikuta/config/classinfo.properties");
        FileInputStream fileInputStream = null;
        try {
            //加载配置文件
            fileInputStream = new FileInputStream(file);
            Properties properties = new Properties();
            properties.load(fileInputStream);

            //通过反射机制进行实例化不同类型的对象
            String className1 = properties.getProperty("className1");
            Class name1 = Class.forName(className1);
            System.out.println(name1.newInstance());

            String className2 = properties.getProperty("className2");
            Class name2 = Class.forName(className2);
            System.out.println(name2.newInstance());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
