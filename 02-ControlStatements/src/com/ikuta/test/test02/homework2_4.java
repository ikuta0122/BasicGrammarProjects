package com.ikuta.test.test02;

/*
4.从控制台接受一个正整数,判断该数字是否为质数（素数）
质数（素数）:大于1的自然数中,除了1和它本身之外不再有其他因数的自然数。
主要练习:在外部打布尔标记.
*/
public class homework2_4 {
    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.print("请输入数字:");
        int num = s.nextInt();
        System.out.println("您输入的数字是" + num);

        //可以在外边准备一个布尔类型.
        boolean suShu = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                suShu = false;
                break;
            }
        }
        System.out.println(suShu ? "是素数" : "不是素数");
		/*
		int count = 0;
		if (num > 1){
			for (int i = 2; i < num; i++){
				if (num % i == 0){
					count++;
				}
			}
			switch (count){
			case 0:
				System.out.println(num + "是素数");
				break;
			default:
				System.out.println("这个数字不是素数");
			}
		}else{
			System.out.println("这个数字不是素数");
		}
		*/
    }
}