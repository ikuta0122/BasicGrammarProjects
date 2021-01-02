package com.ikuta.demo01;

public class User {
    private int id;//私有的
    protected int age;//受保护的
    public int weight;//公开的
    String name; //默认

    public void doSome() {
        System.out.println(this.id);
        System.out.println(this.age);
        System.out.println(this.weight);
        System.out.println(this.name);
    }
}