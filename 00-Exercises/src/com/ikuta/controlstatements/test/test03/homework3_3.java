package com.ikuta.controlstatements.test.test03;

/*
3.计算1!+2!+...+10!
思路:
第一步:定义一个阶乘的方法
第二步:1-10依次放入方法中,结果累加
*/
public class homework3_3 {
    public static void main(String[] args) {
        //1-10依次放入方法中,结果累加
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += homework3_3.jiCheng(i);
        }
        System.out.println("1!+2!+...+10!=" + sum);
    }

    //定义一个阶乘的方法
    public static int jiCheng(int x) {
        int jieGuo = 1;
        for (; x > 1; x--) {
            jieGuo *= x;
        }
        return jieGuo;
    }
}
/*
1!+2!+...+10!=4037913
*/