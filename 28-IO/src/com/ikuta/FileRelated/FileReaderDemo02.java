package com.ikuta.FileRelated;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * FileReader的常用方法:int read(char[] c)
 */
public class FileReaderDemo02 {
    public static void main(String[] args) {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("src/com/ikuta/config/fileInfo.properties");
            // 使用int read(char[] c)方法读取文件
            int readCount = 0;
            char[] chars = new char[4];
            while ((readCount = fileReader.read(chars)) != -1) {
                for (char data : chars) {
                    if (data == ' ') {
                        System.out.println();
                    } else {
                        System.out.print(data);
                    }
                }
                chars = new char[chars.length];//清空数组chars
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}