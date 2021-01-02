package com.ikuta.ConvertRelated;

import java.io.*;

/**
 * InputStreamReader将字节输入流转换成字符输入流
 */
public class InputStreamReaderDemo {
    public static void main(String[] args) {
        FileInputStream fileInputStream;
        BufferedReader bufferedReader = null;
        try {
            //将字节输入流转换成字符输入流
            fileInputStream = new FileInputStream("src/com/ikuta/config/convertInfo.properties");
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            bufferedReader = new BufferedReader(inputStreamReader);

            //测试效果
            String str;
            while ((str = bufferedReader.readLine()) != null) {
                System.out.println(str);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
