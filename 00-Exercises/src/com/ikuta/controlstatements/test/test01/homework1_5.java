package com.ikuta.controlstatements.test.test01;

/*
5.从键盘接收三个整数分别存入变量num1，num2，num3中，按从小打大的顺序输出。
*/
public class homework1_5 {
    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.print("请输入第一个整数：");
        int num1 = s.nextInt();
		System.out.print("\n");
        System.out.print("请输入第二个整数：");
        int num2 = s.nextInt();
        System.out.print("\n");
        System.out.print("请输入第三个整数：");
        int num3 = s.nextInt();
        System.out.println("输入整数：" + num1 + "和" + num2 + "和" + num3);

        int temp = 1;
        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
            //对比num1和num2,将其中较大值放在num2中
            if (num2 > num3) {
                temp = num2;
                num2 = num3;
                num3 = temp;
                //对比num2和num3，将最大值放在num3中
                if (num1 > num2) {
                    temp = num1;
                    num1 = num2;
                    num2 = temp;
                    //对比num1和num2，将最小值放在num1中
                }
            }
        } else if (num2 > num3) {
            temp = num2;
            num2 = num3;
            num3 = temp;
            //对比num2和num3，将最大值放在num3中
            if (num1 > num2) {
                temp = num1;
                num1 = num2;
                num2 = temp;
                //对比num1和num2，将最小值放在num1中
            }
        }
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
    }
}