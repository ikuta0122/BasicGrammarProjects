package com.ikuta.demo.fordemo;

/*
1.所有合法的“控制语句”都可以嵌套使用
2.for循环嵌套一个for循环执行原理是什么？
    在分析外层for循环的时候，把里面的for循环就当成一段普通的java语句
*/
public class ForDemo05 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("value1=" + i);
        }
        //0 1 ...9

        for (int k = 0; k < 2; k++) {
            System.out.println("value2=" + k);
        }
        //0 1

        for (int k = 0; k < 2; k++) {
            for (int i = 0; i < 10; i++) {
                System.out.println("k's value=" + k);
                System.out.println("value3=" + i);
            }
        }
		/*
        在分析外层for循环的时候，把里面的for循环就当成一段普通的java语句
        第一遍0 1 ...9 第二遍0 1 ...9
        第一遍i变量和第二遍i变量是两份不同的内存。
        第一次内循环结束后，i变量的内存就会释放；第二次内循环相当于重新加载了一次内循环，继续用 i = 0进行内循环。
		*/
    }
}
