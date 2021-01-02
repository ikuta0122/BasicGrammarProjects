package com.ikuta.BufferRelated;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
    public static void main(String[] args) {
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(
                    new FileWriter("src/com/ikuta/config/bufferInfo.properties", true)
            );
            bufferedWriter.newLine();//输出行分隔符
            bufferedWriter.write("桥本奈奈未");
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedWriter != null) {//关闭处理流
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}