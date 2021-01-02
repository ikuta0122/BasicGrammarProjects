package com.ikuta.controlstatements.test.test02;

/*
7.找出1000以内的所有的完数。
完数：所有真因子相加等于自身。(1不是完数)
例如：6，6=1+2+3
*/
public class homework2_7 {
    public static void main(String[] args) {
        for (int i = 2; i <= 1000; i++) {
            //1不是完数,从2开始判断
            int sum = 0;
            for (int j = 1; j <= i / 2; j++) {
                //取到一半就行了
                if (i % j == 0) {
                    sum += j;
                    //因子累加
                }
            }
            if (i == sum) {
                System.out.println(i);
            }
        }
    }
}
		/*
		for (int i = 2; i <= 1000; i++){
			int temp = i;
			for (int k = 2; k < i; k++){//在[2,i)之间寻找因子
				if (i % k == 0){
					temp -= k;//完数=1+所有非1因子之和
				}
			}
			if (temp == 1){
				System.out.println(i);
			}
		}
		*/
/*
6
28
496
*/