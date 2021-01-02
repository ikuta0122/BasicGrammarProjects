package com.ikuta.demo;

//以下代码过于臃肿，代码没有得到重复利用
public class ExtendsDemo01 {
    public static void main(String[] args) {
        //创建普通帐户
        AccountBefore act = new AccountBefore();
        act.setActno("11111");
        act.setBalance(10000);
        System.out.println(act.getBalance());
        //创建信用帐户
        CreditAccountBefore ca = new CreditAccountBefore();
        ca.setActno("22222");
        ca.setBalance(-10000);
        ca.setCredit(0.99);
        System.out.println(ca.getBalance());
    }
}

//银行卡类
//属性：账号、余额
class AccountBefore {
    private String actno;
    private double balance;

    public AccountBefore() {

    }

    public AccountBefore(String actno, double balance) {
        this.actno = actno;
        this.balance = balance;
    }

    public String getActno() {
        return actno;
    }

    public void setActno(String actno) {
        this.actno = actno;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

//引用卡类
//属性：账号、余额、信誉度
class CreditAccountBefore {
    private String actno;
    private double balance;
    private double credit;

    public CreditAccountBefore() {

    }

    public String getActno() {
        return actno;
    }

    public void setActno(String actno) {
        this.actno = actno;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }
}