package com.ikuta.demo.fordemo;

/*使用for循环实现九九乘法表
条件1：当行数大于列数时，进入下一行
    声明：i表示行，k表示列
    判断是否要进入下一行，即行数大于列数（i > k）
条件2：每一行以N*1开始，共九行
    int i = 1; i <=9; i++
条件3：N行有N列（列数取决与行数）
    int k = 1; k <= i; k++
条件4：换行语句应当放在for循环之外。
*/
public class ForDemo06 {
    public static void main(String[] args) {
        //列循环（从上到下）
        for (int i = 1; i <= 9; i++) {
            //行循环（从左到右）
            //行循环多少次取决与行数（i）
            for (int k = 1; k <= i; k++) {
                System.out.print(k + "x" + i + "=" + (k * i) + " ");
            }
            System.out.println(" ");
            //每一行结束后，进入下一行
        }
    }
}
