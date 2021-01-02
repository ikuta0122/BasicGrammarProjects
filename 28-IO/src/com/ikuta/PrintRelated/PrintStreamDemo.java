package com.ikuta.PrintRelated;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * PrintStream的创建和使用
 */
public class PrintStreamDemo {
    public static void main(String[] args) {
        PrintStream out = null;
        try {
            out = new PrintStream("src/com/ikuta/config/printInfo.properties");
            System.setOut(out);//改变标准输出流的输出方向
            System.out.println("name=nishino");
            out.flush();//清空管道
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (out != null) {
                out.close();
            }
        }
    }
}
