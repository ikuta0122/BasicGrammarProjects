package com.ikuta.test;

/*
4.关于递归的作业
使用递归的方式计算n的阶乘
*/
public class MethodTest03_1 {
    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        int a = s.nextInt();
        System.out.println(jieCheng(a));
    }

    //使用递归的方式计算n的阶乘
    //递归要有结束条件,当sum(1)中实现结束条件
    //10*sum(9) == 10*9*sum(8)-->10*9*8*...*2*sum(1)
    //sum(1)运行"return n;"语句,返回1
    public static int jieCheng(int n) {
        if (n > 1) {
            n *= jieCheng(n - 1);
        }
        return n;
    }

	/*
	public static int jieCheng(int n){		
		if (n == 1){
			return 1;
		}
		return n * jieCheng(n-1);		
	}
	*/
}