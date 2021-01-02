package com.ikuta.map.Hashtable;

import java.util.Hashtable;
import java.util.Map;

//Hashtable集合不允许key部分或者value部分出现null,否则报错NullPointerException
public class HashtableDemo04 {
    public static void main(String[] args) {
        Map<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(null, "a");//NullPointerException
        hashtable.put(1, null);//NullPointerException
    }
}
