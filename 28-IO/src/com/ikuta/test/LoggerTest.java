package com.ikuta.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日志的简单实现
 */
public class LoggerTest {
    /**
     * @param msg 日志信息
     */
    public static void log(String msg) {
        PrintStream out = null;
        try {
            //第一步:设置标准输出流的的输出方向
            out = new PrintStream(new FileOutputStream("src/com/ikuta/config/logTest.txt", true));
            System.setOut(out);
            //第二步:获取日期当前时间
            Date nowTime = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
            String strTime = sdf.format(nowTime);
            //第三步:字符串拼接
            System.out.println(strTime + " ：" + msg);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (out != null) {
                out.close();
            }
        }
    }

    public static void main(String[] args) {
       log("国庆快乐");
    }
}
