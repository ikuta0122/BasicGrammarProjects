package com.ikuta.demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 测试反射机制调用类的构造方法
 */
class Vip {
    int no;
    String name;
    String birth;
    boolean sex;

    public Vip() {
        super();
    }

    public Vip(int no) {
        super();
        this.no = no;
    }

    public Vip(int no, String name) {
        super();
        this.no = no;
        this.name = name;
    }

    public Vip(int no, String name, String birth) {
        super();
        this.no = no;
        this.name = name;
        this.birth = birth;
    }

    public Vip(int no, String name, String birth, boolean sex) {
        super();
        this.no = no;
        this.name = name;
        this.birth = birth;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Vip [no=" + no + ", name=" + name + ", birth=" + birth + ", sex=" + sex + "]";
    }

}

//通过反射机制调用类的构造方法
public class ReflectDemo09 {
    public static void main(String[] args) {
        try {
            Class vipClass = Class.forName("com.ikuta.demo.Vip");
            //情景:通过反射机制调用类的构造方法
            Constructor constructor = vipClass.getConstructor(int.class, String.class, String.class, boolean.class);
            Object obj = constructor.newInstance(20, "西野七濑", "0525", false);
            System.out.println(obj);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
