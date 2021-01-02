package com.ikuta.generic;

import java.util.ArrayList;
import java.util.List;

//使用钻石表达式[自动类型推断机制]
public class GenericDemo03 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("西野七濑");
        list.add("生田绘梨花");
        list.add("星野南");
        for (String str : list) {
            System.out.println(str);
        }
    }
}
