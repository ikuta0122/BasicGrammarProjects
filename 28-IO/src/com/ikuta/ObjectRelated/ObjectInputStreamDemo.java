package com.ikuta.ObjectRelated;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * ObjectInputStream实现反序列化
 */
public class ObjectInputStreamDemo {
    public static void main(String[] args) {
        ObjectInputStream objectInputStream = null;
        try {
            objectInputStream = new ObjectInputStream(
            		new FileInputStream("src/com/ikuta/config/objectInfo.properties")
			);
            Object object = objectInputStream.readObject();
            System.out.println(object);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (objectInputStream != null) {
                try {
                    objectInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}