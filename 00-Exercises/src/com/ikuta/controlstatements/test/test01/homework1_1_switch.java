package com.ikuta.controlstatements.test.test01;

/*
	根据指定月份，打印该月份所属的季节
		3、4、5春，6、7、8夏，9、10、11秋，12、1、2冬
*/
public class homework1_1_switch {
    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.print("请输入月份：");
        int month = s.nextInt();
        System.out.println("输入月份：" + month);
        switch (month) {
            case 3:
            case 4:
            case 5:
                System.out.print(month + "月是" + "春");
                break;
            case 6:
            case 7:
            case 8:
                System.out.print(month + "月是" + "夏");
                break;
            case 9:
            case 10:
            case 11:
                System.out.print(month + "月是" + "秋");
                break;
            case 12:
            case 1:
            case 2:
                System.out.print(month + "月是" + "冬");
                break;
            default:
                System.out.print("输入信息有误");
        }
    }
}