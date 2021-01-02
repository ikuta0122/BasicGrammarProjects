package com.ikuta.test.test01;

/*4.整数大小比较，输入两个整数，比较大小，
若x>y，输出>
若x<y，输出<
若x=y，输出=
*/
public class homework1_4 {
    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.print("请输入第一个整数：");
        int num1 = s.nextInt();
        System.out.print("\n");
        System.out.print("请输入第二个整数：");
        int num2 = s.nextInt();
        System.out.println("输入整数：" + num1 + "和" + num2);
        if (num1 == num2) {
            System.out.println("=");
        } else {
            System.out.println(num1 > num2 ? ">" : "<");
        }
    }
}