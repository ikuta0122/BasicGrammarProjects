package com.ikuta.test.test04;

/*1.用循环结构打印如下的数值列表
1	10	100	1000
2	20	200	2000
3	30	300	3000
4	40	400	4000
5	50	500	5000
*/
public class homework4_1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            System.out.print(i + " ");
            System.out.print(10 * i + " ");
            System.out.print(100 * i + " ");
            System.out.print(1000 * i + " ");
            System.out.println();
        }
    }
}
/*
1 10 100 1000
2 20 200 2000
3 30 300 3000
4 40 400 4000
*/