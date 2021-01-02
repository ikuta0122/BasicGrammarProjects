package com.ikuta.demo.overload;

/*方法重载机制是什么?
1.以下程序先不使用方法重载机制，分析程序的缺点？
2.sumInt、sumLong、sumDouble功能不同，功能相似
    缺点：代码不美观,调用需要记忆更多方法名
*/
public class OverloadDemo01 {
    public static void main(String[] args){
        System.out.println(sumInt(10,20));
        System.out.println(sumLong(10L,20L));
        System.out.println(sumDouble(10.0,20.0));
    }

    public static int sumInt(int a,int b){
        return a + b;
    }

    public static long sumLong(long a,long b){
        return a + b;
    }

    public static double sumDouble(double a,double b){
        return a + b;
    }
}