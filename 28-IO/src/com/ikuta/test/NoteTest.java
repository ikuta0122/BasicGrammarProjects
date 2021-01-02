package com.ikuta.test;

import java.io.*;
import java.util.Scanner;

/**
 * 记事本的简单实现
 */
public class NoteTest {
    public static void main(String[] args) {
        Scanner reader = null;
        PrintWriter out = null;
        try {
            reader = new Scanner(System.in);
            out = new PrintWriter(
                    new BufferedWriter(
                            new OutputStreamWriter(
                                    new FileOutputStream("src/com/ikuta/config/noteTest.txt"), "UTF-8")),
                    true);

            System.out.println("请开始输入内容");
            while (true) {
                String line = reader.nextLine();
                if ("exit".equals(line)) {
                    break;
                } else {
                    out.println(line);
                }
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                reader.close();
            }
            if (out != null) {
                out.close();
            }
        }
        System.out.println("谢谢输入");
    }
}
