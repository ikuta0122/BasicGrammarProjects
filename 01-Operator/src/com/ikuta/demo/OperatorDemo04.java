package com.ikuta.demo;

/*赋值运算符
1.基本赋值运算符
=
2.扩展赋值运算符
+=	加等
-=	减等
*=	乘等
/=	除等
%=	余等
*/
public class OperatorDemo04 {
    public static void main(String[] args) {
        int k = 10;
        k += 20;//k变量追加20 相当于 k = k + 20；
        System.out.println(k);//30
        //问题：k += 20 和 k = k + 20 真的是完全一样嘛？
        //答案：不一样，只能说相似，本质上并不是完全相同。
        byte b = 100;
        System.out.println(b);
        //b = b + 1;
        //分析：这个代码能否编译通过？我的答案：可以
        //错误: 不兼容的类型: 从int转换到byte可能会有损失
        b += 1;
        //分析：这个代码能否编译通过？我的答案：可以
        //b += 1;和b = b + 1;不一样
        //其实b += 1; 等同于 b = (byte)(b + 1);
        System.out.println(b);//101

        b += 199;//早就超出byte的取值范围。
        //语法机制：使用扩展运算符的时候，永远都不会改变运算结果类型。
        System.out.println(b);//44，自动损失精度。

		int x = 100;
        x += 100;//x = x + 100;
        System.out.println(x);//200
        x -= 100;//x = x - 100;
        System.out.println(x);//100
        x *= 10;//x = x * 10;
        System.out.println(x);//1000
        x /= 30;//x = x / 30;
        System.out.println(x);//33
        x %= 2;//x = x % 2;
        System.out.println(x);//1
    }
}