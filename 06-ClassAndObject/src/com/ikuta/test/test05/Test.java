package com.ikuta.test.test05;

/*5.定义丈夫类Husband和妻子类Wife
    丈夫类的属性包括：身份证号、姓名、生日、妻子
    妻子类的属性包括：身份证号、姓名、生日、丈夫
要求1:提供构造方法（无参数构造方法和有参数构造方法）
要求2:丈夫对象关联妻子对象，妻子对象关联丈夫对象。
要求3:输出这个“丈夫对象”的妻子的名字或者输出这个“妻子对象”的丈夫的名字
要求4:能够画出程序执行过程的内存图。
要求5:能够在程序中演示出空指针异常的效果
*/
public class Test {
    public static void main(String[] args){
        //创建对象
        Husband a = new Husband();
        //Husband a = new Husband("1111", "1111", "1111", null)后期再赋值也可以
        //*内存图：只要是方法，都会在stack中压栈
        Wife b = new Wife();
        //Wife b = new Wife("1111", "1111", "1111", null);后期再赋值也可以

        //丈夫和妻子关联
        a.wife = b;
        b.husband = a;
        //当没有以上两行代码时
        //System.out.println("丈夫" + a.name + "的妻子是" + a.wife.name);
        //a.wife = null,输出代码出现NullPointerException

        //输出名字
        a.name = "xiaoming";
        b.name = "xiaohong";
        System.out.println("丈夫" + a.name + "的妻子是" + a.wife.name);
        System.out.println("妻子" + b.name + "的丈夫是" + b.husband.name);
		
		/*
		空指针异常
		a = null;
		System.out.println(a.name);
		//NullPointerException
		*/
    }
}