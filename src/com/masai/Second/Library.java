package com.masai.Second;

import java.util.ArrayList;
import java.util.List;

public class Library {

    static List<Book> list = new ArrayList<>();

    public static List<Book> getList() {
        return list;
    }

    public static void setList(List<Book> list) {
        Library.list = list;
    }

    public static void addBook(Book book){
        list.add(book);
        System.out.println("successfully added");
        System.out.println("total books are " + list.size());
    }

    public static void removeBook(Book book){
        list.remove(book);
        System.out.println("successfully removed");
    }


}
