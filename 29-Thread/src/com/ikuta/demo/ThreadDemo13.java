package com.ikuta.demo;

/**
 * 使用boolean标记合理终止线程执行[关于stop()方法的思考]
 */
public class ThreadDemo13 {
    public static void main(String[] args) {
        DemoThread13 demoThread = new DemoThread13();
        Thread thread = new Thread(demoThread);
        thread.setName("thread");
        thread.start();
        try {
            Thread.sleep(1000 * 5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        demoThread.setRun(false);
    }
}

class DemoThread13 implements Runnable {
    private boolean run = true;//使用boolean标记合理终止线程执行

    public boolean isRun() {
        return run;
    }

    public void setRun(boolean run) {
        this.run = run;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (this.isRun()) {
                System.out.println(Thread.currentThread().getName() + "--->" + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("线程" + Thread.currentThread().getName() + "被终止执行");
                return;
            }
        }
    }
}