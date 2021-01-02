package com.ikuta.controlstatements.test.test03;

/*
4.	球从100米高度自由落下,
	每次落地后反跳回原高度的一半再落下.
	求它在第10次落地时,共经过多少米?
规律:
	第1次反跳又落下100
	第2次反跳又落下50
	第N次反跳又落下100 / (2^(n-2))
	第9次反跳又落下100/2^8
思路:
第一步:定义一个方法,分别计算1-9次反跳又落下经过的距离.
第二步:九次循环的结果累加再加上100
*/
public class homework3_4 {
    public static void main(String[] args) {
        double sum = 100;
        for (int i = 1; i <= 9; i++) {
            sum += homework3_4.jump(i);
        }
        System.out.println("第10次落地时,共经过" + sum + "米");
    }

    //定义一个方法,分别计算1-9次反跳又落下经过的距离.
    public static double jump(int x) {
        double jingGuo = 100;
        for (; x > 1; x--) {
            jingGuo /= 2;
        }
        return jingGuo;
    }
}
/*
100
100
50
25
12.5
6.25
3.125
1.5625
0.78125
0.390625
299.609375
第10次落地时,共经过299.609375米
*/