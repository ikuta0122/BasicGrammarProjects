package com.ikuta.FileRelated;

import java.io.FileWriter;
import java.io.IOException;

/**
 * FileWriter的构造方法:FileWriter(String name)
 */
public class FileWriterDemo01 {
    public static void main(String[] args) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("src/com/ikuta/config/fileInfo.properties");
            fileWriter.write("Ikuta=Erika");
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