package com.ikuta.FileRelated;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * FileInputStream的常用方法:int read()
 */
public class FileInputStreamDemo01 {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("src/com/ikuta/config/fileInfo.properties");
            //使用int read()方法读取文件
            int readData = 0;
            while ((readData = fileInputStream.read()) != -1) {
                char data = (char) readData;
                if (data == ' ') {
                    System.out.println();
                } else {
                    System.out.print(data);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
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