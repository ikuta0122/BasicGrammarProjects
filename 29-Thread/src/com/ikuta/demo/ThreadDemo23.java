package com.ikuta.demo;

class DemoClass23 {
    private String actNo;
    private double balance;

    public String getActNo() {
        return actNo;
    }

    public void setActNo(String actNo) {
        this.actNo = actNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public DemoClass23() {
        super();
    }

    public DemoClass23(String actNo, double balance) {
        super();
        this.actNo = actNo;
        this.balance = balance;
    }

    /**
     * 取款方法[使用线程同步机制]
     *
     * @param money 取款金额
     */
    public void withdraw(double money) {
        synchronized (this) {
            double before = this.balance;//取款之前的余额
            if (before < money) {
                System.out.println("取款失败,余额:" + before);
                return;
            } else {
                double after = this.balance - money;//取款之后的余额
                try {
                    Thread.sleep(1000 * 5);//模拟网络延迟
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                this.setBalance(after);//更新余额
            }
        }
    }
}

class DemoThread23 extends Thread {
    private DemoClass23 account;

    public DemoThread23(DemoClass23 account) {
        super();
        this.account = account;
    }

    @Override
    public void run() {
        double money = 5000;//假设取款五千
        account.withdraw(money);
        System.out.println(Thread.currentThread().getName()
                + "对账户:" + account.getActNo()
                + "取款:" + money
                + ",余额:" + account.getBalance()
        );
    }

}

/**
 * 关于线程的安全问题[synchronized修饰共享对象]
 * 如果出现网络延迟但使用线程同步机制,那么一组线程针对同一个对象进行数据操作不会出现数据安全问题
 * 期望效果:
 * 线程thread1对账户:account-001取款:5000.0,余额:5000.0
 * 线程thread2对账户:account-001取款:5000.0,余额:0.0
 * 实际效果[模拟网络延迟]:
 * 线程thread1对账户:account-001取款:5000.0,余额:5000.0
 * 线程thread2对账户:account-001取款:5000.0,余额:0.0
 */
public class ThreadDemo23 {
    public static void main(String[] args) {
        //线程thread1和thread2共享一个对象
        DemoClass23 account = new DemoClass23("account-001", 10000);
        Thread thread1 = new DemoThread23(account);
        Thread thread2 = new DemoThread23(account);
        thread1.setName("thread1");
        thread2.setName("thread2");
        //启动线程thread1和thread2,并且保证线程thread1先启动
        thread1.start();
        try {
            Thread.sleep(1000);//当前线程休眠1秒[线程thread2比线程thread1晚启动]
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread2.start();
    }
}
