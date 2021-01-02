package com.ikuta.demo;

//抽象类的实例化问题
public class AbstractDemo01 {
    public static void main(String[] args) {
        //情景1:抽象类是否可以实例化?
        //Account a = new Account();
        //报错:'Account' is abstract; cannot be instantiated

        //情景2:子类继承抽象类,子类是否可以实例化?
        CreditAccount1 ca = new CreditAccount1();
    }
}

//抽象类
abstract class Account {
    public Account() {
        super();
    }

    public Account(String s) {
        super();
    }
}

//子类继承抽象类
class CreditAccount1 extends Account {
}

//抽象类的子类是否可以为抽象类
abstract class CreditAccount2 extends Account {
}