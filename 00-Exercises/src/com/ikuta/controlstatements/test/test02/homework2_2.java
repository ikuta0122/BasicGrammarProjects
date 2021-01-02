package com.ikuta.controlstatements.test.test02;

/*
2.计算1+2-3+4-...+100的结果
规律：奇数时减法，偶数时加法
思路1：（除1之外）所有的偶数求和，所有的奇数求和，然后偶数求和的结果减去奇数求和的结果再加1
思路2：循环过程中取出每个值，判断奇偶数，偶数就加，奇数就减。
*/
public class homework2_2 {
    public static void main(String[] args) {
        int sum = 1;
        for (int i = 2; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            } else {
                sum -= i;
            }
        }
        System.out.println(sum);
    }
}
/*
52
*/