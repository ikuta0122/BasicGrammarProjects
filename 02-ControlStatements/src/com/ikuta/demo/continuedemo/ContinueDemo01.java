package com.ikuta.demo.continuedemo;

/*continue语句
1.执行原理
    终止当前"本次"循环,直接进入下一次循环继续执行。
    for(){
        if (){
            continue;
            //当这个continue语句执行时，continue下面的代码不执行，直接进入下一次循环继续执行。
        }
    }
*/
public class ContinueDemo01 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println("i=" + i);
        }
        //输出0-4,执行5次
        //结论:break语句终止循环语句的执行
        System.out.println("~~~~~~~~~~~~");
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println("i=" + i);
        }//输出012346789,少了5
        System.out.println("~~~~~~~~~~~~");
        for (int i = 0; i < 10; i++) {
            System.out.println("i=" + i);
            if (i == 5) {
                continue;
            }
        }//输出0123456789与上面输出012345789进行对比
        //两者continue与输出语句的顺序不同
        //得出结论:continue执行之后,直接跳到下一次循环继续执行。
    }
}
