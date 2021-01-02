package com.ikuta.demo;

//静态方法和实例方法的适用场景
/*
如果行为在发生时因为对象的变化而变化，那么此时使用实例方法。
如果行为在发生时不因对象的变化而变化，那么此时使用静态方法。
什么时候使用静态方法？
	大部分情况下，工具类的方法一般都是静态方法。
	（静态方法有一个优点：不需要new对象，直接采用“类名.”调用，极其方便）
	（设计工具类的目的就是为了方便，所以工具类中的方法一般是静态方法）
什么时候使用实例方法？
	方法体中直接访问了实例变量，那么这个方法一定是实例方法。
*/
public class StaticDemo05 {
    public static void main(String[] args) {
        User01 user01 = new User01();
        user01.setId(100);
        System.out.println(user01.getId());

        User02 user02 = new User02("张三");
        user02.printName();
    }
}

class User01 {
    private int id;

    public void setId(int i) {
        id = i;
    }

    public int getId() {
        return id;
    }
}

class User02 {
    private String name;

    public User02(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println(name);
    }
}