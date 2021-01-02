package com.ikuta.FileRelated;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * FileReader的常用方法:int read()
 */
public class FileReaderDemo01 {
    public static void main(String[] args) {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("src/com/ikuta/config/fileInfo.properties");
            //使用int read()读取文件
            int readData = 0;
            while ((readData = fileReader.read()) != -1) {
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