package com.ikuta.test;

//以下程序的输出结果是?
//语法规则1:方法体中的代码必须遵循自上而下顺序依次逐行执行
//语法规则2:return语句一旦执行,整个方法必须结束
public class ExceptionTest01 {
    public static void main(String[] args) {
        int result = m();
        System.out.println(result);
    }

    /**
     * 反编译之后的结果
     * public static in m(){
     * int i = 100;
     * int j = i;
     * i++;
     * return j;
     * }
     */
    public static int m() {
        int i = 100;
        try {
            return i;//这行代码出现在int i = 100;的下面,所以最终结果必须是返回100
        } finally {
            i++;
        }
    }
}