package com.ikuta.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//finally语句块中的代码一定执行
public class ExceptionDemo10 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("src/com/ikuta/config/TestException.txt");
            String s = null;
            s.toString();//触发空指针异常
            System.out.println("HelloWorld");//如果控制台没有输出HelloWorld,那么表示发生异常从而输入流fis尚未关闭
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        } finally {
            System.out.println("finally语句块中的代码一定会执行,所以流的关闭应当在finally语句块中执行");
            if (fis != null) {//关闭流之前需要判断是否为空指针,避免空指针异常
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
