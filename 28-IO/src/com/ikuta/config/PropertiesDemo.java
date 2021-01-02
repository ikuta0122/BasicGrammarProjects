package com.ikuta.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args) {
        File file = new File("src/com/ikuta/config/propertiesInfo.properties");
        FileInputStream fileInputStream = null;
        try {
            //第一步:创建输入流对象和Properties对象
            fileInputStream = new FileInputStream(file);
            Properties properties = new Properties();
            //第二步:通过输入流对象将配置文件数据加载到Properties集合中[通过Properties对象的load()方法实现]
            properties.load(fileInputStream);
            //第三步:通过Properties对象的getProperty()和setProperty()读写配置文件数据
            System.out.println(properties.getProperty("name"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //第四步:输入流使用完毕后关闭输入流[通过输入流对象的close()方法实现]
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