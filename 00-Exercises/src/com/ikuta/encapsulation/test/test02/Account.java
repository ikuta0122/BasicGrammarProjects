package com.ikuta.encapsulation.test.test02;

//属性：账号、余额、年利率
public class Account {
    private String id;

    //id的get和set方法
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private double balance;

    //balance的get和set方法
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    private String annualInterestRate;

    //annualInterestRate的get和set方法
    public String getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(String annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    //构造方法
    public Account() {
        this("未知", 0, "未知");
    }

    public Account(String id, double balance, String annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    //取款方法
    public void withdraw(double money) {
        if (money < 0) {
            System.out.println("输入信息错误");
            return;
        }
        this.balance += money;
        System.out.println("成功存入" + money + "元");
    }

    //存款方法
    public void deposit(double money) {
        if (this.balance < money) {
            System.out.println("余额不足，取钱失败");
            return;
        }
        this.balance -= money;
        System.out.println("成功取出" + money + "元");
    }
}