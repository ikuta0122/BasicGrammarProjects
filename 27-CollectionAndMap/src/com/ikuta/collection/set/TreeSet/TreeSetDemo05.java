package com.ikuta.collection.set.TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

//实现TreeSet自动排序的第二种方式:初始化时传入实现Comparator接口并重写compare()方法的比较器对象
public class TreeSetDemo05 {
    public static void main(String[] args) {
        TreeSet<Goods> goods = new TreeSet<>(new GoodsComparator());
        goods.add(new Goods(3, "可乐"));
        goods.add(new Goods(4, "绿茶"));
        goods.add(new Goods(2, "矿泉水"));

        for (Goods good : goods) {
            System.out.println(good);
        }
    }
}

class Goods {
    private int price;
    private String name;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Goods() {
    }

    public Goods(int price, String name) {
        this.price = price;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}

class GoodsComparator implements Comparator<Goods> {
    @Override
    public int compare(Goods o1, Goods o2) {
        return o1.getPrice() - o2.getPrice();
    }
}