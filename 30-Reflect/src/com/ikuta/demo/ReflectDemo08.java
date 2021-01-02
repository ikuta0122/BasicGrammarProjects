package com.ikuta.demo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 测试反射机制调用对象方法
 */
class UserService {
    public boolean login(String name, String password) {
        if ("admin".equals(name) && "123".equals(password)) {
            return true;
        }
        return false;
    }

    public void logout() {
        System.out.println("系统已经安全退出");
    }
}

//通过反射机制调用对象方法
public class ReflectDemo08 {
    public static void main(String[] args) {
        try {
            Class userServiceClass = Class.forName("com.ikuta.demo.UserService");
            Object obj = userServiceClass.newInstance();
            //情景:通过反射机制调用对象方法
            Method loginMethod = userServiceClass.getDeclaredMethod("login", String.class, String.class);
            Object loginState = loginMethod.invoke(obj, "admin", "123");
            System.out.println((boolean) loginState ? "登陆成功" : "登陆失败");
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