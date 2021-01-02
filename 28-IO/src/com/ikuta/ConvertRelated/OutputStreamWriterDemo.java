package com.ikuta.ConvertRelated;

import java.io.*;

/**
 * OutputStreamWriter将字节输出流转换成字符输出流
 */
public class OutputStreamWriterDemo {
    public static void main(String[] args) {
        FileOutputStream fileOutputStream;
        BufferedWriter bufferedWriter = null;
        try {
            //将字节输出流转换成字符输出流
            fileOutputStream = new FileOutputStream("src/com/ikuta/config/convertInfo.properties", true);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
            bufferedWriter = new BufferedWriter(outputStreamWriter);
            //测试效果
            bufferedWriter.newLine();
            bufferedWriter.write("时间=1994.05.25");
            bufferedWriter.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}