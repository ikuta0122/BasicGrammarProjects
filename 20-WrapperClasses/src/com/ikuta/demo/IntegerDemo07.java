package com.ikuta.demo;

//int和String和Integer的类型互换
public class IntegerDemo07 {
    public static void main(String[] args) {
        // 情景1:int类型的转换
        int a = 7;
        Integer a1 = Integer.valueOf(a);
        System.out.println(a1 instanceof Integer);
        String a2 = a + "";
        System.out.println(a2 instanceof String);
        String a3 = String.valueOf(a);
        System.out.println(a3 instanceof String);

        // 情景2:Integer类型的转换
        Integer b = new Integer(77);
        int b1 = b.intValue();
        System.out.println(b1);
        String b2 = String.valueOf(b);
        System.out.println(b2 instanceof String);

        // 情景3:String类型的转换
        String c = "777";
        int c1 = Integer.parseInt(c);
        System.out.println(c1);
        Integer c2 = Integer.valueOf(c);
        System.out.println(c2 instanceof Integer);
    }
}