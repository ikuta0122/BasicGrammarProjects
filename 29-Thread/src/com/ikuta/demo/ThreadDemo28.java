package com.ikuta.demo;

class Num {
    int i = 1;// 设定初始值为1
}

/**
 * 奇数线程
 */
class MyThreadOne implements Runnable {
    private Num num;

    public MyThreadOne(Num number) {
        this.num = number;
    }

    @Override
    public void run() {
        while (true) {//使用死循环输出奇数
            synchronized (num) {//对象锁
                try {
                    if (num.i % 2 == 0) {//偶数等待
                        num.wait();
                    } else {//奇数输出
                        System.out.println(Thread.currentThread().getName() + "--->" + (num.i++));
                    }
                    try {
                        Thread.sleep(1000); //每隔一秒执行一次
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    num.notify();//唤醒该对象上的等待线程
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

/**
 * 偶数线程
 */
class MyThreadTwo implements Runnable {
    private Num num;

    public MyThreadTwo(Num number) {
        this.num = number;
    }

    @Override
    public void run() {
        while (true) {//使用死循环输出偶数
            synchronized (num) {
                try {
                    if (num.i % 2 == 1) {//奇数等待
                        num.wait();
                    } else {//偶数输出
                        System.out.println(Thread.currentThread().getName() + "--->" + (num.i++));
                    }
                    try {
                        Thread.sleep(1000);//每隔一秒执行一次
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    num.notify();//唤醒该对象上的等待线程
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

/**
 * 生产者/消费者模式的交替输出
 */
public class ThreadDemo28 {
    public static void main(String[] args) {
        Num num = new Num();
        Thread thread1 = new Thread(new MyThreadOne(num));
        Thread thread2 = new Thread(new MyThreadTwo(num));
        thread1.setName("thread1");
        thread2.setName("thread2");
        thread1.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		thread2.start();
    }
}
