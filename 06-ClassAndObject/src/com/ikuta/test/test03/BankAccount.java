package com.ikuta.test.test03;

/*
3.设计银行账户类，每个账户都有账号、密码、余额
*/
public class BankAccount {
    String username;
    String password;
    double money;

    public BankAccount() {

    }

    public BankAccount(String a, String b, double c) {
        username = a;
        password = b;
        money = c;
    }
}