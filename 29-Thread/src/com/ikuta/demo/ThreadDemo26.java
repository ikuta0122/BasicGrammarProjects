package com.ikuta.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 关于定时器机制的简单实现
 */
public class ThreadDemo26 {
    public static void main(String[] args) {
        try {
            Timer timer = new Timer();//创建定时器对象
            // Timer timer = new Timer(true);//守护线程的方式


            //第二步:设置定时任务的首次执行时间
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date firstTime = dateFormat.parse("2020-09-30 15:00:00");
            //第三步:设置定时任务的间隔事件
			int period = 1000 * 10;

			timer.schedule(new LogTimerTask(), firstTime, period);//开启定时器机制
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}

/**
 * 记录日志的定时任务类
 */
class LogTimerTask extends TimerTask {
    @Override
    public void run() {//第一步:设置定时任务的执行内容
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String strTime = dateFormat.format(new Date());
        System.out.println(strTime + "--->完成了一次数据备份");
    }
}