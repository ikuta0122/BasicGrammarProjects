package com.ikuta.demo.method;

/*
需求1和需求2本质上相同，只不过参与运算的数据不同
代码编写了两份，显然代码没有得到重复利用，
专业术语叫做“复用性”差。

功能/业务逻辑既然相同，为什么要重复编写代码，
代码能不能写一次，以后要是需要再次使用该“功能/业务”的时候，直接调用就可以了。

如果想达到代码复用，需要学习java语言中的方法机制。
*/
public class MethodDemo01 {
    public static void main(String[] args) {
        //需求1:编写程序,计算100和200的求和
        int x = 100;
        int y = 200;
        int z = x + y;
        System.out.println(x + "+" + y + "=" + z);

        //需求2:编写程序,计算666和888的求和
        //这个需求2实际上和需求1师完全相同的,只不过具体求和时的"数据不同"
        int a = 666;
        int b = 888;
        int c = a + b;
        System.out.println(a + "+" + b + "=" + c);
    }
}