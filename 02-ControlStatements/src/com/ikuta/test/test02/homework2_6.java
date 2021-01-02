package com.ikuta.test.test02;

/*6.	小芳的妈妈每天给他2.5元，他都会存起来。
	但是，每当这一天是存钱的第5天或者5的倍数的话，他都会花6元；
	请问，经过多少天，小芳才可以存到100元。
*/
public class homework2_6 {
    public static void main(String[] args) {
        int day = 0;
        double money = 0;
        for (; money < 100; money += 2.5) {
            day++;
            if (day % 5 == 0) {
                money -= 6;
            }
        }
        System.out.println("经过" + day + "天，小芳才可以存到" + money + "元。");
    }
}
/*
74
*/