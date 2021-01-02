package com.ikuta.demo.switchdemo;

/*题目：
1.系统从键盘上接收一个学生的考试成绩，根据考试成绩输出成绩等级
    优		[90，100]
    良		[80,90）
    中		[70,80）
    及格	[60,70）
    不及格	[0,60)
2.要求成绩是一个合法的数字，成绩必须在[0，100]，成绩可能带小数点
3.必须使用switch语句完成
*/
public class SwitchDemo02 {
    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.print("请输入学生成绩：");
        double score = s.nextDouble();
        System.out.println("学生成绩：" + score);
        if (score > 100 || score < 0) {
            System.out.println("输入信息有误");
            return;
        }
        //通过除以10，再进行int强制转换，确定区间
        int grade = (int) (score / 10);
        //根据grade确定成绩等级
        String str = " ";
        switch (grade) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                str = "不及格";
                break;
            case 6:
                str = "及格";
                break;
            case 7:
                str = "中";
                break;
            case 8:
                str = "良";
                break;
            case 9:
            case 10:
                str = "优";
                break;
        }
        System.out.println("学生等级：" + str);
    }
}
