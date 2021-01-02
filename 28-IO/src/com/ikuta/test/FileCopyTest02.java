package com.ikuta.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * FileReader + FileWriter实现普通文本文件拷贝
 */
public class FileCopyTest02 {
    public static void main(String[] args) {
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        try {
            fileReader = new FileReader("src/com/ikuta/config/fileInfo.properties");
            fileWriter = new FileWriter("src/com/ikuta/config/fileInfoCopy.properties");
            int readCount = 0;
            char[] chars = new char[4];
            while ((readCount = fileReader.read(chars)) != -1) {
                fileWriter.write(chars, 0, readCount);
            }
            fileWriter.flush();
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
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}