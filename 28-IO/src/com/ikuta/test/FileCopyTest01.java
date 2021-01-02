package com.ikuta.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * FileInputStream + FileOutputStream实现任意文件拷贝
 */
public class FileCopyTest01 {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream("src/com/ikuta/config/fileInfo.properties");
            fileOutputStream = new FileOutputStream("src/com/ikuta/config/fileInfoCopy.properties");
            byte[] bytes = new byte[1024];//单次读取/写入单位：1024字节/1KB
            int readCount = 0;
            while ((readCount = fileInputStream.read(bytes)) != -1) {
                fileOutputStream.write(bytes, 0, readCount);
            }
            fileOutputStream.flush();
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
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}