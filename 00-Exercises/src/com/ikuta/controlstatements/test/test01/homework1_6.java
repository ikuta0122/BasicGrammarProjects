package com.ikuta.controlstatements.test.test01;

/*6.从键盘接收公里数，输出总价格。
打车起步价8元（3km以内）
超过3km，超出3km的每公里1.2元；
超过5km，超出5km的每公里1.5元；
*/
public class homework1_6 {
    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.print("请输入公里数：");
        double num = s.nextDouble();
        double money = 8;

        if (num > 3 && num <= 5) {
            money = 8 + 1.2 * ((int) (num + 0.99) - 3);
        } else if (num > 5) {
            money = 10.4 + 1.5 * ((int) (num + 0.99) - 5);
        }
        System.out.println("总价格：" + money + "元");
    }
}