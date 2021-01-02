package com.ikuta.test.test03;

/*
5.	一个四位数,恰好等于去掉他的首位数字之后所剩的三位数的三倍.
	这个四位数是多少?
思路:
第一步:1000-9999遍历寻找
第二步:条件对比
*/
public class homework3_5 {
    public static void main(String[] args) {
        for (int i = 1000; i <= 9999; i++) {
            if (i % 1000 * 3 == i) {
                System.out.println("这个四位数是" + i);
                break;
            }
        }
    }
}
/*
这个四位数是1500
*/