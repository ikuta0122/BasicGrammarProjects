package com.ikuta.demo;

import java.util.Arrays;

//解析main方法的形参String[] args--->接收用户输入参数
/*输入参数的添加方式
终端工具:java 类名 参数1 参数2 参数3
IDEA:Run--->Edit Configurations--->Configuration--->Program arguments
Eclipse:Run--->Run Configurations--->Arguments--->Program arguments
*/
public class ArrayDemo05 {
    public static void main(String[] args) {
        if (args.length == 0) {//JVM传递的数组args默认长度为0[数组对象创建但没有任何数据]
            System.out.println("用户无输入参数");
        } else {
            System.out.println(Arrays.toString(args));
        }
    }
}