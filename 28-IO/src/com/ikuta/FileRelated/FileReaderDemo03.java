package com.ikuta.FileRelated;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * FileReader的常用方法:long skip(long n)
 */
public class FileReaderDemo03 {
    public static void main(String[] args) {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("src/com/ikuta/config/fileInfo.properties");
            fileReader.skip(6);//long skip(long n)
            int readCount = 0;
            char[] chars = new char[4];
            while ((readCount = fileReader.read(chars)) != -1) {
                System.out.print(new String(chars, 0, readCount));
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