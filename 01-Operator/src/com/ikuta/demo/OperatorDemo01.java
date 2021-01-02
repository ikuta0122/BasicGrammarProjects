package com.ikuta.demo;

/*算术运算符
+	加
-	减
*	乘
/	除
%	求余数
++	自加1
--	自减1
*/
public class OperatorDemo01 {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        System.out.println(a + b);//13
        System.out.println(a - b);//7
        System.out.println(a * b);//30
        System.out.println(a / b);//3
        System.out.println(a % b);//1

        //研究：++出现在变量前和变量后有什么区别？
        //语法：当++出现在变量后，会先做赋值运算再做自加1。
        int m = 10;
        int n = m++;
        System.out.println(m);//11
        System.out.println(n);//10

        //语法：当++出现在变量前，会先做自加1在做赋值运算。
        int x = 20;
        int y = ++x;
        System.out.println(x);//21
        System.out.println(y);//21

    }
}