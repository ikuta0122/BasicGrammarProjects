package com.ikuta.demo;

//关于Object类中的finalize()方法
public class ObjectDemo06 {
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            Person person = new Person();
            person = null;//将引用设置为null,该引用会被GC回收
        }
        System.gc();//建议启动垃圾回收器（只是建议，也有可能不启动）
    }
}

//业务需求：记录JVM中的对象释放时间
class Person {
    //重写finalize()方法
    //Person类型的对象被垃圾回收器回收的时候，GC负责调用finalize()方法。
    protected void finalize() throws Throwable {
        System.out.println(this + "即将被销毁");
    }
}