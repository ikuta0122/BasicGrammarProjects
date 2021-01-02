package com.ikuta.demo;

//体验使用StringBuffer进行字符串的拼接操作
public class StringBufferDemo {
    public static void main(String[] args) {
        // 创建默认初始化容量的StringBuffer对象
        StringBuffer stringBuffer = new StringBuffer();
        // append()方法底层在进行追加时,如果byte数组满了会自动扩容
        stringBuffer.append("a");
        stringBuffer.append("b");
        stringBuffer.append("c");
        stringBuffer.append(3.14);
        stringBuffer.append(true);
        stringBuffer.append(100L);
        System.out.println(stringBuffer);

        // 创建指定初始化容量的StringBuffer对象
        StringBuffer stringBuffer2 = new StringBuffer(77);
        stringBuffer2.append("hello");
        stringBuffer2.append("world");
        stringBuffer2.append("hello");
        stringBuffer2.append("world");
		System.out.println(stringBuffer2);
	}

}