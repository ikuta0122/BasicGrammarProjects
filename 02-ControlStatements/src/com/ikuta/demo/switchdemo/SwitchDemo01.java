package com.ikuta.demo.switchdemo;

/*switch语句
1.switch语句的语法格式
    switch(值){
    case 值1：
        java语句块
        break；
    case 值2：
        java语句块
        break；
    default:
        java语句块
    }
2.执行原理
    1)如果“值”与“值1”相同,则执行该分支中的java语句,当遭遇break语句时,switch语句结束
    2)如果“值”与“值1”不同,则继续与“值2”进行比较，依此类推。
    3)如果所有的case都没有匹配成功,则执行default中的java语句
3.注意事项
    1)如果分支执行了,但是分支最后没有break语句,则发生case穿透现象
	2)switch语句中break和dafault不是必须的
	3)switch语句本质上只支持int类型和String类型
	4)switch语句也支持byte、short、char,因为byte、short、char可以进行自动类型转换
*/
//业务要求:接受键盘输入,根据输入的数字来判断星期几
public class SwitchDemo01 {
    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.println("请输入数字[0，6]的整数");
        int day = s.nextInt();
        System.out.println("您输入的数字是：" + day);
        String str = "输入信息有误";
        if (day > 6 || day < 0) {
            System.out.println(str);
        } else {
            switch (day) {
                case 0:
                    str = "星期日";
                    break;
                case 1:
                    str = "星期一";
                    break;
                case 2:
                    str = "星期二";
                    break;
                case 3:
                    str = "星期三";
                    break;
                case 4:
                    str = "星期四";
                    break;
                case 5:
                    str = "星期五";
                    break;
                case 6:
                    str = "星期六";
                    break;
            }
            System.out.println("今天是" + str);
        }
    }
}