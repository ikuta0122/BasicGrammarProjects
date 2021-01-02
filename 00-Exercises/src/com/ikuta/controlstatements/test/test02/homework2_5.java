package com.ikuta.controlstatements.test.test02;

/*
5.从键盘接受一个正整数，该正整数作为行数，输出以下图形
	*
   ***
  *****
 *******
*********
例如：输入5,则打印如上图5行。
规律1:k行最多num+k-1个字符
规律2:k行前num-k字符是空格
*/
public class homework2_5 {
    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.print("输入一个正整数");
        int num = s.nextInt();

        if (num < 0) {
            System.out.println("输入信息有误");
            return;
        }

        //k表示行,输出num行
        for (int k = 1; k <= num; k++) {
			//i表示列,输出num+k-1个字符
			for (int i = 1; i <= num + k - 1; i++) {
                if (i <= num - k) {//每一行前面的空格数为（num-k）
                    System.out.print(" ");//输出空格
                } else {//每一行最后一个*的位置是num+k-1
                    System.out.print("*");//输出*
                }
            }
            System.out.println();//每一行结束后，换行
        }
    }
}