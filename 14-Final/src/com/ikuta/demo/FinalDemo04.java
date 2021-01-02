package com.ikuta.demo;

/*常量
结论1：final修饰的实例变量一般添加static修饰[理由如下]
结论2：static final联合修饰的变量称为“常量”[常量名建议全部大写，每个单词之间用下划线_连接]
结论3：常量实际上和静态变量一样，区别在于常量的值不能变。
结论4：常量和静态变量都存储在方法区，都在类加载时初始化。
结论5：常量一般都是公开的(public),而且不用封装
*/
public class FinalDemo04 {
    public static void main(String[] args) {
        //访问常量
        System.out.println(Chinese.COUNTRY);

        //情景:给常量赋值
        //Chinese.COUNTRY = "美国";//报错:Cannot assign a value to final variable 'COUNTRY'
    }
}

class Chinese {
    String idCard;
    String name;
    /*final String country = "中国";
    既然final的country中的值不会改变，还有必要声明为实例变量吗?
    首先,实例变量在堆内存中而一个对象占用一份对内存空间,不当使用实例变量会浪费堆内存空间
    其次,如果实例变量被final修饰,那么该实例变量的值不会随着对象的变化而变化
    最后,如果实例变量的值不会随着对象的变化而变化,那么可以将其声明为静态变量存储于方法区中
     */
    public static final String COUNTRY = "中国";
}
