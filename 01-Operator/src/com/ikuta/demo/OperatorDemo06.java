package com.ikuta.demo;

/*+运算符
1.+ 运算符在java语言中有两个作用。
	作用1：求和			两边都是数字类型
	作用2：字符串拼接	任意一边是字符串字符
	字符串拼接完的结果还是一个字符串。

2.当一个表达式中有多个加号+的时候，遵循自左向右的顺序依次执行。
*/
public class OperatorDemo06 {
    public static void main(String[] args) {
        int nianLing = 35;
        System.out.println("年龄=" + nianLing);
        //年龄=35。+运算符在这里会进行字符串的拼接

        int a = 100;
        int b = 200;
        System.out.println(a + b);
		//300,+运算符在这里做加法运算。

        System.out.println(a + b + "110");//字符串300110
        //第一个+先运算进行求和，第二个+后运算进行字符串拼接
        //注意：当一个表达式中有多个加号+的时候，遵循自左向右的顺序依次执行。
    }
}