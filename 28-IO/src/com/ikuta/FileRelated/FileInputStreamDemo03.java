package com.ikuta.FileRelated;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * FileInputStream的常用方法:int available() + long skip(long n)
 */
public class FileInputStreamDemo03 {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("src/com/ikuta/config/fileInfo.properties");
            System.out.println("文件总字节数:" + fileInputStream.available());// int available()
            fileInputStream.skip(14);// long skip(long n)
            // 使用int read(byte[] b)方法读取文件
            int readCount = 0;
            byte[] bytes = new byte[1024];
            while ((readCount = fileInputStream.read(bytes)) != -1) {
                String content = new String(bytes, 0, readCount);
                char[] chars = content.toCharArray();
                for (char data : chars) {
                    if (data == ' ') {
                        System.out.println();
                    } else {
                        System.out.print(data);
                    }
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