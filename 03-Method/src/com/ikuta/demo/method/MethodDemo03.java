package com.ikuta.demo.method;

/*方法怎么定义?
    [修饰符列表] 返回值类型 方法名(形式参数列表){
        方法体;
    }
*/

/*方法怎么调用?
    类名.方法名(实际参数列表);
"类名."什么时候可以省略？
    在同一个类中
实参和形参必须数量对应，类型也要对应
*/
public class MethodDemo03 {
    public static void main(String[] args) {
        //调用方法
        int s1 = MethodDemo03.sum(10, 2);
        //(10,2)叫做实际参数列表，简称实参
        System.out.println(s1);//12

        //s2可以是double类型吗？
        //可以，自动类型转换
        double s2 = MethodDemo03.sum(10, 2);
        System.out.println(s2);//12.0
    }

    //要求：计算两个int类型数据的和
    public static int sum(int a, int b) {
        return a + b;
    }
}