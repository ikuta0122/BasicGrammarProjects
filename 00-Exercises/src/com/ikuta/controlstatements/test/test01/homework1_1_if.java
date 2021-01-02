package com.ikuta.controlstatements.test.test01;

/*根据指定月份，打印该月份所属的季节
3、4、5春
6、7、8夏
9、10、11秋
12、1、2冬
*/
public class homework1_1_if {
	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("请输入月份：");
		int month = s.nextInt();
		System.out.println("输入月份：" + month);
		if (month == 3 || month == 4 || month == 5){
			System.out.print(month + "月是" + "春");
		}else if (month == 6 || month == 7 || month == 8){
			System.out.print(month + "月是" + "夏");
		}else if (month == 9 || month == 10 || month == 11){
			System.out.print(month + "月是" + "秋");
		}else if (month == 1 || month == 2 || month == 12){
			System.out.print(month + "月是" + "冬");
		}else{
			System.out.print("输入信息有误");
		}
	}
}