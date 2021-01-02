package com.ikuta.demo.dowhiledemo;

/*do...while循环
1.语法机制
    do {
        循环体;
    }while(布尔表达式);
    注意：do...while循环语句最后需要加分号

2.执行原理
    先执行循环体当中的代码，执行一次循环体之后，
    判断布尔表达式的结果，如果为true，则继续执行；
    如果为false，则do...while循环结束。

3.注意事项
    do...while循环的循环次数是：1-n次
    循环体至少执行1次。
*/
public class DoWhileDemo01 {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 10);
        //0 1 2 3 ...9 执行10次
    }
}
