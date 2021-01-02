package com.ikuta.demo.ifdemo;

/*业务要求
1.从键盘上接受天气的信息
    1表示雨天
    0表示晴天
2.从键盘上接受性别的信息
    1表示男
    0表示女
3.业务要求
    当天气是雨天的时候
        男的：打一把大黑伞
        女的：打一把小花伞
    当天气是晴天的时候
        男的：不需要防晒霜去玩耍
        女的：需要防晒霜
4.需要if语句以及嵌套的方式展示这个业务
*/
public class IfDemo05 {
    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.println("请输入天气：1表示雨天，0表示晴天");
        int a = s.nextInt();//a表示天气
        System.out.println("请输入性别：1表示男，0表示女");
        int b = s.nextInt();//b表示性别
        if (a == 1) {
            System.out.println("雨天");
            if (b == 1) {
                System.out.println("男生打一把大黑伞");
            } else if (b == 0) {
                System.out.println("女生打一把小花伞");
            } else
                System.out.println("输入信息有误");
        } else if (a == 0) {
            System.out.println("晴天");
            if (b == 1) {
                System.out.println("男生不需要防晒霜去玩耍");
            } else if (b == 0) {
                System.out.println("女生需要防晒霜");
            } else
                System.out.println("输入信息有误");
        } else
            System.out.println("输入信息有误");
    }
}
