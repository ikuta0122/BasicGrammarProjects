package com.ikuta.demo;

//测试:什么时候使用关键字super(实参)
/*分析new CreditAccount()
首先,调用自身的无参构造器CreditAccount()
其次,调用父类的无参构造器Account()
最后,调用根类的无参构造器Object()
结论:虽然调用了多个类的无参构造器但是只创建了一个CreditAccount类型的对象
 */
public class SuperDemo03 {
    public static void main(String[] args) {
        CreditAccount ca1 = new CreditAccount();
        CreditAccount ca2 = new CreditAccount("11111", 10000.0, 0.99);
    }
}

//父类:账户[属性:账,余额]
//Account默认继承Object类
class Account {
    private String actno;

    public String getActno() {
        return actno;
    }

    public void setActno(String actno) {
        this.actno = actno;
    }

    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Account() {
        super();
    }

    public Account(String actno, double balance) {
        this.actno = actno;
        this.balance = balance;
    }
}

//子类:信用账户[属性:账号,余额,信誉度]
class CreditAccount extends Account {
    private double credit;

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public CreditAccount() {
        super();
    }

    public CreditAccount(String actno, double balance, double credit) {
        //父类的私有属性只能在本类中访问,需要通过子类构造方法调用父类构造方法来进行初始化当前对象的父类特征
        super(actno, balance);
        this.credit = credit;
    }
}