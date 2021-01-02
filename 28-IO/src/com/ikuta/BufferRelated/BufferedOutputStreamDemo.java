package com.ikuta.BufferRelated;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * BufferedOutputStream的创建和使用
 */
public class BufferedOutputStreamDemo {
    public static void main(String[] args) {
        BufferedOutputStream bufferedOutputStream = null;
        try {
            bufferedOutputStream = new BufferedOutputStream(
                    new FileOutputStream("src/com/ikuta/config/bufferInfo.properties", true)
            );
            String str = "\n星野南";
            bufferedOutputStream.write(str.getBytes());
            bufferedOutputStream.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedOutputStream != null) {//只需关闭处理流而无需关闭节点流
                try {
                    bufferedOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}