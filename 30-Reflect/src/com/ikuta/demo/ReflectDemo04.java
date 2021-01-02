package com.ikuta.demo;

//获取类路径下文件的绝对路径
public class ReflectDemo04 {
    public static void main(String[] args) {
        // 相对路径的缺点--->移植性差
        // File file = new File("src/com/ikuta/demo/ReflectDemo04.java");

        // 获取类路径下文件的绝对路径
        String path = Thread.currentThread().getContextClassLoader().getResource("").getPath();
        System.out.println(path);
        //输出:/E:/IDEAProjects/BasicGrammarProjects/out/production/30-Reflect/

        String filePath = Thread.currentThread().getContextClassLoader().getResource("com/ikuta/demo/ReflectDemo04.class").getPath();
        System.out.println(filePath);
        //输出:/E:/IDEAProjects/BasicGrammarProjects/out/production/30-Reflect/com/ikuta/demo/ReflectDemo04.class
    }
}