package com.ikuta.BufferRelated;

import java.io.*;

/**
 * BufferedInputStream的创建和使用
 */
public class BufferedInputStreamDemo {
    public static void main(String[] args) {
        BufferedInputStream bufferedInputStream = null;
        try {
            bufferedInputStream = new BufferedInputStream(
                    new FileInputStream("src/com/ikuta/config/bufferInfo.properties")
            );
            System.out.println("可读字节数:" + bufferedInputStream.available());// int available()
            bufferedInputStream.skip(14);// long skip(long n)

            // int read(byte[] b)
            int readCount = -1;
            byte[] bytes = new byte[bufferedInputStream.available()];
            while ((readCount = bufferedInputStream.read(bytes)) != -1) {
                System.out.println(new String(bytes, 0, readCount));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedInputStream != null) {//只需关闭处理流而无需关闭节点流
                try {
                    bufferedInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}