package com.ikuta.FileRelated;

import java.io.FileWriter;
import java.io.IOException;

/**
 * FileWriter的构造方法:FileWriter(String name, boolean append)
 */
public class FileWriterDemo02 {
    public static void main(String[] args) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("src/com/ikuta/config/fileInfo.properties",true);
            fileWriter.write("\nNishino=Nanase");
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
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