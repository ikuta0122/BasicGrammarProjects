package com.ikuta.encapsulation.test.test01;

public class BookTest {
    public static void main(String[] args) {
        Book b1 = new Book("English", 520);
        b1.detail();

        b1.setPageNum(80);
        b1.detail();

        Book b2 = new Book();
        b2.detail();
    }
}
