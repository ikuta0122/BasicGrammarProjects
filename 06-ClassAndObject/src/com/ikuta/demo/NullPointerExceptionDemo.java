package com.ikuta.demo;

/*
	NullPointerException（空指针异常）
			出现空指针异常的前提条件是?
			"空引用"访问实例相关[对象相关]的数据时,都会出现空指因异常.

	关于垃圾回收器:GC
		在java语言中,垃圾回收器主要针对的是堆内存,
		当一个java对象没有任何引用指向该对象的时候,
		GC会考虑将该垃圾数据释放回收掉.
*/
public class NullPointerExceptionDemo {
    public static void main(String[] args) {
        //创建客户对象
        Customer c = new Customer();
        //访问客户c的id
        System.out.println(c.id);//0
        //重新给id赋值
        c.id = 9521;
        System.out.println(c.id);//9527

        c = null;
        System.out.println(c.id);//NullPointerException
    }
}

class Customer {
    int id;
}
