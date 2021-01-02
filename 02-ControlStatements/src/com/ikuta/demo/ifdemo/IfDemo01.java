package com.ikuta.demo.ifdemo;

/*if语句
1.语法格式
    if（布尔表达式）{
        java语句1；
    }else{
        java语句2；
    }
2.执行原理
	如果布尔表达式的结果是true ，则执行java语句1，不执行java语句2。
	如果布尔表达式的结果是false，则执行java语句2，不执行java语句1。
*/
public class IfDemo01 {
    public static void main(String[] args) {
        boolean sex = true;
        //当sex为true时表示男，当sex为false是表示女。
        if (sex) {
            System.out.println("男");
        } else {
            System.out.println("女");
        }

        //可以使用三目运算符
        sex = false;
        System.out.println(sex ? "男" : "女");
    }
}
