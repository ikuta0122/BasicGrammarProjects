package com.ikuta.ObjectRelated;

import java.io.*;

/**
 * Student类实现Serializable接口,参与序列化和反序列化
 */
class Student implements Serializable {
    private static final long serialVersionUID = 1281418127726430941L;
    private int no;
    private String name;

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student() {
        super();
    }

    public Student(int no, String name) {
        super();
        this.no = no;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [no=" + no + ", name=" + name + "]";
    }
}

/**
 * ObjectOutputStream实现序列化
 */
public class ObjectOutputStreamDemo {
    public static void main(String[] args) {
        ObjectOutputStream objectOutputStream = null;
        try {
            objectOutputStream = new ObjectOutputStream(
                    new FileOutputStream("src/com/ikuta/config/objectInfo.properties")
            );
            objectOutputStream.writeObject(new Student(101, "jack"));//序列化对象
            objectOutputStream.flush();//清空管道
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (objectOutputStream != null) {
                try {
                    objectOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}