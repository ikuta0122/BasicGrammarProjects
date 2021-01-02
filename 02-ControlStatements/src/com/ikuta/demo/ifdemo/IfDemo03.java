package com.ikuta.demo.ifdemo;

/*业务要求
1.从键盘上接收一个人的年龄。
2.年龄要求为（0-150），其他值表示非法，需要提示非法信息。
3.根据人的年龄来动态的判断这个人属于生命的哪个阶段
    0-5 婴幼儿
    6-10 少儿
    11-18少年
    19-35青年
    36-55中年
    56-150 老年
4.请使用if语句完成以上的业务逻辑
5.不使用嵌套语句
*/
public class IfDemo03 {
    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.println("请输入年龄：");
        int i = s.nextInt();
        System.out.println("您输入的年龄是" + i);

		/*
		if(i >= 0 && i <= 5)
			System.out.println("这个人是婴幼儿");
		if(i >= 6 && i <= 10)
			System.out.println("这个人是少儿");
		if(i >= 11 && i <= 18)
			System.out.println("这个人是少年");
		if(i >= 19 && i <= 35)
			System.out.println("这个人是青年");
		if(i >= 36 && i <= 55)
			System.out.println("这个人是中年");
		if(i >= 56 && i <= 150)
			System.out.println("这个人是老年");
		if(i < 0 || i > 150) {
			System.out.println("您输入的年龄不正确");
			System.out.println("输入年龄应当在0到150之间");
		*/
        //进一步精简
        String age = "老年";
        if (i >= 0 && i <= 5)
            age = "婴幼儿";
        if (i >= 6 && i <= 10)
            age = "少儿";
        if (i >= 11 && i <= 18)
            age = "少年";
        if (i >= 19 && i <= 35)
            age = "青年";
        if (i >= 36 && i <= 55)
            age = "中年";
        if (i >= 0 && i <= 150)
            System.out.println("这个人是" + age);
        if (i < 0 || i > 150) {
            System.out.println("您输入的年龄不正确");
            System.out.println("输入年龄应当在0到150之间");
        }

    }
}
