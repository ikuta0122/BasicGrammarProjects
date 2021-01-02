package com.ikuta.demo.breakdemo;

/*break；语句
1.执行原理
    第一个位置：用在switch语句当中，用来终止switch语句的执行。
        用在switch语句当中，防止case穿透现象，终止switch语句的执行。
    第二个位置：用在循环语句当中，用来终止循环语句的执行。
        for循环、while循环、do...while循环

2.注意事项
    break；语句的执行并不会让整个方法结束，
    break；语句主要是用来终止离它最近的那个循环语句。

3.怎么用break;语句终止指定的循环呢?
    第一步:需要给循环起一个名字
        a : for (){
            b: for(){
            }
        }
    第二步:终止循环
        break a;
*/
public class BreakDemo01 {
    public static void main(String[] args) {
        //业务要求：输出到5就终止（0 1 2 3 4 5）
        for (int k = 0; k < 2; k++) {
            System.out.print("k=" + k + " ");
            for (int i = 0; i < 10; i++) {
                System.out.print("i=" + i + " ");
                if (i == 5) {
                    System.out.println();
                    break;
                    //break;语句会让离它最近的循环终止结束掉。
                    //break;语句只对内层for循环语句有影响。
                }
            }
        }
        //k=0 i=0 i=1 i=2 i=3 i=4 i=5
        //k=1 i=0 i=1 i=2 i=3 i=4 i=5

		/*
		可以通过先命名for循环语句（变量名+冒号），
		然后break 变量名；的方式来使break语句终止外层循环。
		a: for (int k = 0; k < 2; k++){
			System.out.println("k=" + k);
			b: for (int i = 0; i < 10; i++){
				System.out.println("i=" + i);
				if (i == 5){
					break a;
				}
			}
		}
		*/

        System.out.println("break；语句不会终止整个方法");
        //这里的代码照常执行。break；语句的执行并不会影响效果。
    }
}
