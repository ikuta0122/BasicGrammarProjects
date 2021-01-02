package com.ikuta.demo.recursion;

//使用递归，编写程序：计算1到n的和
public class RecursionDemo03 {
    public static void main(String[] args) {
        //1到10的和
        int a = sum(10);
        System.out.println(a);
    }

    //使用递归:计算1到n的和
    //递归要有结束条件,当sum(1)中实现结束条件
    //10+sum(9) == 10+9+sum(8)-->10+9+8+...+2+sum(1)
    //sum(1)运行"return n;"语句,返回1
    public static int sum(int n) {
        if (n > 1) {
            n += sum(n - 1);
        }
        return n;
		/*
		变形 n
		if (n == 1){
			return n;
		}
		//当n自减1为1时，返回1
		return n + sum(n-1);
		//程序能进行到这里证明此处n不是1
		*/
		/*return的值
		10+	sum(9)
			sum(9)+	8
					sum(8)+	7
					...........
								2+	sum(1)
									1
		*/
    }
}