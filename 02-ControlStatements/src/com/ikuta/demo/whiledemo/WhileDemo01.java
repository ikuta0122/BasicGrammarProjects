package com.ikuta.demo.whiledemo;

/*while循环
1.语法机制
        while（布尔表达式）{
            循环体；
        }

2.执行原理
        判断布尔表达式的结构，如果为true就执行循环体；
        循环体结束之后，再次判断布尔表达式的结果...依此类推;
        直到布尔表达式的结果为false，while循环结束。

3.注意事项
    while循环的循环次数是：0-n次
*/
public class WhileDemo01 {
    public static void main(String[] args){
		/*死循环
		while (true){
			System.out.println("死循环");
		}
		*/

        //本质上while循环和for循环的原理是相同的。
        /*
		for (初始化表达式;布尔表达式 ;更新表达式 ){
			循环体；
		}
		*/
        /*
        初始化表达式；
        while (布尔表达式){
            循环体；
            更新表达式；
        }
		*/
		int i = 0;
		while (i < 10){
			System.out.println("i=" + i);
			i++;
		}
    }
}
