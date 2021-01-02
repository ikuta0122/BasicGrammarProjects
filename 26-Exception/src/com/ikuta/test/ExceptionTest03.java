package com.ikuta.test;

import java.util.Scanner;

//自定义异常
class UsernameLengthException extends Exception {
    public UsernameLengthException() {
        super();
    }

    public UsernameLengthException(String message) {
        super(message);
    }
}

//检验用户名输入长度[6,14]
public class ExceptionTest03 {
    public static void check(String username) throws UsernameLengthException {
        if (null == username || username.length() < 6 || username.length() > 14) {
            throw new UsernameLengthException("用户名长度在[6,14]之间");
        }
        System.out.println("验证成功");
    }

    public static void main(String[] args) {
        System.out.println("输入用户名");
        Scanner scanner = new Scanner(System.in);
        System.out.print("用户名:");
        String username = scanner.next();
        scanner.close();
        try {
            check(username);
        } catch (UsernameLengthException e) {
            e.printStackTrace();
        }
    }
}
