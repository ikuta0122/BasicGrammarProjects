package com.ikuta.demo;

//方法重写和异常的联合使用
public class ExceptionDemo14 {
    public static void main(String[] args) {
        Animal animal = new Cat();
		try {
			animal.doSome();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class Animal {
    public void doSome() throws Exception {
        System.out.println("Animal");
    }
}

class Cat extends Animal {
    @Override
    public void doSome() {//重写之后的方法不能比重写之前的方法抛出异常不能更多可以更少
        System.out.println("Cat");
    }
}