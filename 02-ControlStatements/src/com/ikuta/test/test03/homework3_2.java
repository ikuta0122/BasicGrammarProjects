package com.ikuta.test.test03;

/*
2.猴子吃桃问题:猴子第一天摘下若干个桃子,当即吃了一半,不过瘾还多吃了一个;
			以后每天早上都吃了前一天剩下的一半零一个;
			到了第十天早上只剩下一个桃子。
			求第一天摘了几个桃子？
思路:逆推法
	天	个数
	10	1
	9	4
	8	10
	...	(n+1)*2
	逆推九次
*/
public class homework3_2 {
    public static void main(String[] args) {
        //逆推法
        int count = 1;
        for (int day = 1; day < 10; day++) {
            count = (count + 1) * 2;
        }
        System.out.println("第一天摘了" + count + "个桃子");
    }
}
/*
第一天摘了1534个桃子
*/