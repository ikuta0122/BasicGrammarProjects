package com.ikuta.demo;

//Object类的clone()方法
public class ObjectDemo08 {
    public static void main(String[] args) {
        Pig pig1 = new Pig(1, 100.0);
        Pig pig2 = null;
        try {
            pig2 = pig1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println(pig1 != pig2);//true表示实现深克隆
    }
}

class Pig implements Cloneable {
    private int id;
    private double weight;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Pig() {
    }

    public Pig(int id, double weight) {
        this.id = id;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Pig{" +
                "id=" + id +
                ", weight=" + weight +
                '}';
    }

    @Override
    protected Pig clone() throws CloneNotSupportedException {
        return (Pig) super.clone();
    }
}
