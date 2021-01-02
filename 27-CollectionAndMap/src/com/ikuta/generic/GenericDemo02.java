package com.ikuta.generic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//使用泛型机制指定集合元素的数据类型
public class GenericDemo02 {
    public static void main(String[] args) {
        List<AnimalAfter> list = new ArrayList<AnimalAfter>();
        AnimalAfter cat = new CatAfter();
        AnimalAfter bird = new BirdAfter();
        list.add(cat);
        list.add(bird);

        //遍历集合,调用元素的move()方法
        Iterator<AnimalAfter> iterator = list.iterator();
        while (iterator.hasNext()) {
            AnimalAfter object = iterator.next();
            //通过泛型机制指定集合元素的数据类型,通过集合元素调用方法不需要进行向下转型
            object.move();
        }
    }
}

class AnimalAfter {
    public void move() {
        System.out.println("动物在移动");
    }
}

class CatAfter extends AnimalAfter {
}

class BirdAfter extends AnimalAfter {
}