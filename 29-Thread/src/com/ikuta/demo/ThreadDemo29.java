package com.ikuta.demo;

public class ThreadDemo29 extends Thread {
    private String name;

    public ThreadDemo29(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + ",您好");
    }

    public static void main(String[] args) {
        new ThreadDemo29("谢剑鑫").run();
        new ThreadDemo29("谢剑鑫").start();
    }
}
