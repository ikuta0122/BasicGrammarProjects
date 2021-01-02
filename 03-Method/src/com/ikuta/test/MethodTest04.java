package com.ikuta.test;

/*
4.编写程序：模拟用户登录功能
	程序开始运行时先在dos命令窗口初始面，提醒用户输入账号和密码，
	当账号为admin，密码为123时，打印“欢迎”，
	当账号或者密码不正确时，打印“输入信息有误”并推出系统。
*/
/*
1.	String user = s.nextLine();输入字符串，仅限一行
2.	符号	比较内容						使用方法
	==		比较的是字符串的内容和地址	a == b
	equals	比较的是字符串的内容			a.equals(b)
*/
public class MethodTest04 {
	//定义方法：检测账号
	public static boolean zhangHao(String a){
		if (a.equals("admin")){
			return true;
		}else {
			return false;
		}
	}
	//定义方法：检测密码
	public static boolean miMa(String a){
		if (a.equals("123")){
			return true;
		}else {
			return false;
		}
	}
	//入口
	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("输入账号：");
		String user = s.nextLine();
		System.out.print("输入密码：");
		String key = s.nextLine();

		if (zhangHao(user)){
			if (miMa(key)){
				System.out.println("欢迎");
			}else {
				System.out.println("输入信息有误");
			}
		}else{
			System.out.println("输入信息有误");
		}
	}
}