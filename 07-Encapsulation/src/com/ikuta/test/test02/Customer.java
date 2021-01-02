package com.ikuta.test.test02;

public class Customer {
    private String name1;

    //name1的get和set方法
    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    private String name2;

    //name2的get和set方法
    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    private Account account;

    //account的get和set方法
    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    //构造方法
    public Customer() {
        this("未知", "未知", null);
    }

    public Customer(String name1, String name2, Account account) {
        this.name1 = name1;
        this.name2 = name2;
        this.account = account;
    }
}
