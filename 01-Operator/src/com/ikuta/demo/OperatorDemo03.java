package com.ikuta.demo;

/*逻辑运算符
&	逻辑与		并且	and	有假得假
|	逻辑或		或者	or	有真得真
!	逻辑非		取反	!false = true
&&	短路与
||	短路或
逻辑运算符的两边要求都是boolean布尔型，并且最终的运算结果也是boolean布尔型。
*/
public class OperatorDemo03 {
    public static void main(String[] args) {
        int a = 100;
        int b = 90;
        int c = 80;
        System.out.println(a < b & b > c);//false
        //对于逻辑与&运算符来说，只要有一边是false，结果就是false。
        System.out.println(a < b | b > c);//true
        //对于逻辑或|运算符来说，只要有一边是true，结果就是true。
        System.out.println(!(a < b));//true
        //注意：这里需要加一个小括号，有优先级问题。
	
		/*关于短路与&& ,短路或||
		短路与&& 和逻辑与&的区别：
			这两个运算符的运算结果完全相同。
			只不过“短路与&&”会发生短路现象。
		什么是短路现象？
			右边表达式不执行，这种现象叫做短路现象。
		什么时候会发生短路？
			左边表达式已经满足逻辑运算符的要求。
		什么时候使用短路与&&？什么时候使用逻辑与& ？
			从效率方面来说，短路与&&的效率高一些。
		*/
        int x = 10;
        int y = 11;
        System.out.println(x > y & x > y++);
        //左边的x > y已经是false了，其实整个表达式的结果已经是false了，按道理来说右边的x > y++已经不用执行了。
        System.out.println(y);
        //12，说明右边的x > y++已经执行。
        System.out.println(x > y && x > y++);
        System.out.println(y);
        //12，说明右边的x > y++没有执行。
    }
}