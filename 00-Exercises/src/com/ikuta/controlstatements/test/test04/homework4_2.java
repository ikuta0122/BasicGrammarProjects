package com.ikuta.controlstatements.test.test04;

/*
2.打印2到10000的所有素数，每行显示8个素数
*/
/*
控制每行的输出个数，可以添加一个变量用来监控输出次数
每输出一次加一，当满足整除时换行。
*/
public class homework4_2 {
    public static void main(String[] args) {
        int huanHang = 0;
        for (int i = 2; i <= 1000; i++) {
            boolean flag = true;
            for (int k = 2; k < i; k++) {
                if (i % k == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.print(i + " ");
                huanHang++;
                if (huanHang % 8 == 0) {
                    System.out.println();
                }
            }
        }
    }
}