package com.ikuta.generic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//分析不使用泛型机制存在什么缺点?
public class GenericDemo01 {
    public static void main(String[] args) {
        List list = new ArrayList();
        AnimalBefore cat = new CatBefore();
        AnimalBefore bird = new BirdBefore();
        list.add(cat);
        list.add(bird);

        //遍历集合,调用元素的move()方法
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object object = iterator.next();
            if (object instanceof AnimalBefore) {
                //集合中元素类型不同,通过集合元素调用方法需要进行向下转换
                ((AnimalBefore) object).move();
            }
        }
    }
}

class AnimalBefore {
    public void move() {
        System.out.println("动物在移动");
    }
}

class CatBefore extends AnimalBefore {
}

class BirdBefore extends AnimalBefore {
}