package com.ikuta.demo;

//使用继承来解决代码复用问题[继承的缺点:耦合度太高]
public class ExtendsDemo02 {
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

//父类:银行卡类
class AccountAfter {
    private String actno;
    private double balance;

    public AccountAfter() {

    }

    public AccountAfter(String actno, double balance) {
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

//子类:信用卡类
class CreditAccountAfter extends AccountBefore {
    private double credit;

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public CreditAccountAfter() {

    }

    public CreditAccountAfter(String actno, double balance, double credit) {
        super(actno, balance);
        this.credit = credit;
    }
}