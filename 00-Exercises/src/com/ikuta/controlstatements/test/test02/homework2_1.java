package com.ikuta.controlstatements.test.test02;
/*
1.计算0-1000以内所有不能被7整除的整数之和
思路：
第一步：从1开始循环，循环到1000，保证每一个数字都可以取到
第二步：一个数字一个数字的筛查，判断数字是否能被7整除。
第三步：将筛选出来的数字相加。
*/
public class homework2_1 {
    public static void main(String[] args) {
        int sum = 0;
        //在外部准备一个变量，用来存储求和的结果。
        for (int i = 1; i <= 1000; i++) {
            if (i % 7 != 0) {
                sum += i;
            }
        }
        //在for循环结束之后，结果才算完，所以在for循环外输出。
        System.out.println(sum);
    }
}
/*
429429
*/