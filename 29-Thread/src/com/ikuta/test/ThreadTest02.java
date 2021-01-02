package com.ikuta.test;

class TrainStation {
    private String name;
    private int count;

    public TrainStation() {
        super();
    }

    public TrainStation(String name, int count) {
        super();
        this.name = name;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "TrainStation [name=" + name + ", count=" + count + "]";
    }

    public boolean buy() {
        synchronized (this) {
            if (this.count == 0) {
                return false;
            } else {
                this.setCount(--count);
                return true;
            }
        }
    }
}

class TestThread02 extends Thread {
    private TrainStation trainStation;

    public TestThread02(TrainStation trainStation) {
        super();
        this.trainStation = trainStation;
    }

    @Override
    public void run() {
        if (trainStation.buy()) {
            System.out.println(Thread.currentThread().getName()
                    + "购票成功[名称:" + trainStation.getName()
                    + ",剩余票数:" + trainStation.getCount() + "]"
            );
        } else {
            System.out.println(Thread.currentThread().getName()
                    + "购票失败[名称:" + trainStation.getName()
                    + ",剩余票数:" + trainStation.getCount() + "]"
            );
        }
    }
}

/**
 * 多线程并发模拟火车站购票系统,要求一人一票
 */
public class ThreadTest02 {
    public static void main(String[] args) {
        TrainStation ts = new TrainStation("南京--->北京", 100);//创建火车站对象
        for (int i = 1; i <= 120; i++) {//调用newThread()方法创建120个线程并将其启动
            newThread(i, ts);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void newThread(int i, TrainStation trainStation) {
        Thread thread = new TestThread02(trainStation);
        thread.setName("thread" + i);
        thread.start();
    }
}
