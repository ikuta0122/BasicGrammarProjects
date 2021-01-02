package com.ikuta.BufferRelated;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * BufferedReader的创建和使用
 */
public class BufferedReaderDemo {
    public static void main(String[] args) {
        BufferedReader bufferedReader = null;
        String str;
        try {
            bufferedReader = new BufferedReader(new FileReader("src/com/ikuta/config/bufferInfo.properties"));
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