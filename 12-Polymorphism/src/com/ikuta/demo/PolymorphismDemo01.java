package com.ikuta.demo;

public class PolymorphismDemo01 {
    public static void main(String[] args) {
        //测试向上转型
        Animal a2 = new Cat();
        a2.move();//猫走猫步
        //测试得知：子类可以转为父类

        //测试向下转型
        Animal a3 = new Cat();
        Cat a4 = (Cat) a3;
        //测试得知：父类转为子类需要强制类型转换符

        //测试没有继承关系的两个类进行转型
        //Animal a3 = new Dog();
        //错误: 不兼容的类型: Dog无法转换为Animal

        //测试:向下转型的风险
        Animal a6 = new Bird();//表面上a6是一个Animal，实际上运行时是一只鸟
		/*分析以下程序：编译时和运行时有什么区别？
		Cat y = (Cat)a6;
		y.catchMouse();
		编译时，编译器认为a6是Animal类型，而Animal和Cat有继承关系，编译通过。
		运行时，堆内存实际创建的对象是Bird对象，
				 而运行过程中，Bird转换成Cat对象就不行了，
				 两者之间没有继承关系。
		类型转换异常java.lang.ClassCastException: class Bird cannot be cast to class Cat
		*/
        //如果a6是一只猫,再进行向下转型
        if (a6 instanceof Cat) {
            Cat y = (Cat) a6;
            y.catchMouse();
        }
    }
}