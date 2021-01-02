package com.ikuta.demo;

/*条件运算符（三目运算符）
1.语法格式：布尔表达式？表达式1 ：表达式2
2.执行原理：
	布尔表达式为true 时，表达式1的执行结果作为整个表达式的结果。
	布尔表达式为false时，表达式2的执行结果作为整个表达式的结果。
*/
public class OperatorDemo05 {
    public static void main(String[] args) {
        boolean sex = false;
        System.out.println(sex ? '男' : "女");//女
    }
}