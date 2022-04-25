package com.masai.Second;

import java.util.List;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        Book book1 = new WingsOfFire("Wings of Fire","Kalam","xyz");

        Library.addBook(book1);

        Book book2 = new Notebook("noteBook", "Nicholas", "abc");

        Library.addBook(book2);

        List<Book> books = Library.getList();
        System.out.println(books);

        Person p = new Santhosh("santhosh");

        p.myBook(new WingsOfFire(),null, "santhosh");


    }
}
