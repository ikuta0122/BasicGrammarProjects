package com.ikuta.test.test04;

/*
5.输出
		*
	   ***
	  *****
	   ***
	    *
其中，行数由键盘输入控制，为2*num-1行(num为键盘输入数)

规律1:上面部分
i表示行，输出num行
k表示列，输出num + i - 1列

规律2:下面部分n-1行
m表示行，输出num-1行
n表示列，输出2*num - m -1列
*/
public class homework4_5 {
    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.print("请输入一个正整数：");
        int num = s.nextInt();
        System.out.println();
        if (num < 0) {
            System.out.println("输入信息有误");
            return;
        }

        //上方
        //i表示行，输出n行
        //k表示列，输出n + i - 1列
        for (int i = 1; i <= num; i++) {
            for (int k = 1; k <= num + i - 1; k++) {
                if (k <= num - i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        //下方
        //m表示行，输出num-1行
        //n表示列，输出2*num - m -1列
        for (int m = 1; m <= num - 1; m++) {
            for (int n = 1; n <= 2 * num - m - 1; n++) {
                if (n <= m) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
/*
请输入一个正整数：7

      *
     ***
    *****
   *******
  *********
 ***********
*************
 ***********
  *********
   *******
    *****
     ***
      *
*/