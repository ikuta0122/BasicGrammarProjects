package com.ikuta.test.test02;

/*
2.编写一个类Accouont，代表账户
	1.具有属性：账户id、余额balance、年利率annualInterestRate
	2.具有方法：各属性的set和get方法、取款方法withdraw()、存款方法deposit()
	3.编写测试程序AccouontTest
		3.1创建一个Customer，名字叫Jane Smith，账号为1000，余额为2000，年利率为1.23%
		3.2	对Jane Smith操作					信息显示
			---------------------------------------------------------------------------------------------------------------
			存入100元							成功存入：100
			取出960元							成功取出：960
			取出2000元							余额不足，取钱失败
			打印Jane Smith的基本信息			Customer[Smith，Jane] has a account：id is 1000 annualInterestRate is 1.23% balance is 1140
*/
public class AccountTest {
    public static void main(String[] args) {
        Account b = new Account("1000", 2000, "1.23%");
        Customer a = new Customer("Jane", "Smith", b);
        //对Jane Smith的账户操作
        a.getAccount().withdraw(100);
        a.getAccount().deposit(960);
        a.getAccount().deposit(2000);
        //打印Jane Smith的基本信息
        //Customer [Smith,Jane] has a account：id is 1000 annualInterestRate is 1.23% balance is 1140
        System.out.print("Customer [" + a.getName2() + "," + a.getName1() + "] has a account:");
        System.out.print(" id is " + a.getAccount().getId());
        System.out.print(" annualInterestRate is " + a.getAccount().getAnnualInterestRate());
        System.out.print(" balance is " + a.getAccount().getBalance());
    }
}