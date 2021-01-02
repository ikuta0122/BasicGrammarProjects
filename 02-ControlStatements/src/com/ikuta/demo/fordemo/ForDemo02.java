package com.ikuta.demo.fordemo;

/*
1.语法机制
    for（初始化表达式；条件表达式；更新表达式）{
        循环体；
    }

2.执行原理
    1.执行初始化表达式，并且初始化表达式只执行一次；
    2.判断条件表达式的结果，
        如果结果为true，则先执行循环体，再执行更新表达式；
        更新表达式执行完之后，再次判断条件表达式...
        如果结果为false，则for循环终止。
        （条件表达式--->循环体--->更新表达式--->条件表达式...）

3.注意事项
    第一,初始化表达式最先执行，并且在整个循环中只执行一次
    第二,条件表达式结果必须是一个布尔类型，也就是true或者false
    第三,更新表达式的存在是为了条件表达式有可能是false，如果缺失更新表达式，很可能导致死循环。
*/
public class ForDemo02 {
    public static void main(String[] args) {
        //最常见的for循环:循环10次，输出0-9
        for (int i = 0; i < 10; i++) {
            System.out.println("i=" + i);
        }
		/*
		对于以上的这个for循环，其中i=0最先执行，并且只执行一次。
		而且，i变量属于for循环的局部变量，for循环结束之后i的内存就释放了。
		i变量属于for循环域，在main方法中没有办法直接使用。
		*/

		/*
		for循坏的变形1
		int i = 0;//i变量的作用域就扩大了。
		for (; i < 10 ; i++ ){
			System.out.println("i=" + i);
		}
		for循坏的变形2
		for (int i = 0; i < 10 ; ){
			System.out.println("i=" + i);
			 i++;
		}
		System.out.println("i=" + i);
			问题：i的值是多少
			我的答案：i = 0？
			错误，因为我认为for循环结束之后，i的内存释放了，for循环中的i与main方法中的i的值不对应。
			编译答案：i = 10
			for循环结束之后，main方法中i变量的值与for循环中的i变量值一致。
		*/
    }
}
