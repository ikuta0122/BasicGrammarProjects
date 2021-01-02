package com.ikuta.PrintRelated;

import java.io.*;

/**
 * PrintWriter的创建和使用
 */
public class PrintWriterDemo {
    public static void main(String[] args) {
        PrintWriter out = null;
        try {
            out = new PrintWriter(
                    new FileWriter("src/com/ikuta/config/printInfo.properties",true),
                    true
            );
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        out.print("age=26");
        out.close();
    }
}