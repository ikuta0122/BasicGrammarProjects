package com.ikuta.demo.ifdemo;

/*业务要求
1.系统从键盘上接收一个学生的考试成绩，根据考试成绩输出成绩等级
    优		[90，100]
    良		[80,90）
    中		[70,80）
    及格	[60,70）
    不及格	[0,60)
2.要求成绩是一个合法的数字，成绩必须在[0，100]，成绩可能带小数点
*/
public class IfDemo04 {
    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.println("该学生的成绩是？");
        double score = s.nextDouble();
        System.out.println("该学生的成绩是" + score);
        String rank = "优";
        if (score >= 0 && score <= 100) {
            if (score < 60) {
                rank = "不及格";
            } else if (score < 70) {
                rank = "及格";
            } else if (score < 80) {
                rank = "中";
            } else if (score < 90) {
                rank = "良";
            }
            System.out.println("该学生的等级是" + rank);
        } else
            System.out.println("输入信息有误");
    }
}