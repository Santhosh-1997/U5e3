package com.masai.Second;

public abstract class Person {

   private String username;
   private Book bookCurrent;

    public Person(String username) {
        this.username = username;
    }

    public abstract void myBook(Book b, Book bookCurrent, String username);

}

class Santhosh extends Person{

    public Santhosh(String username) {
        super(username);
    }

    @Override
    public void myBook(Book b, Book bookCurrent, String username) {
        bookCurrent = b;
        Library.removeBook(bookCurrent);
        System.out.println(b + "is given to " + username);
        System.out.println("total book size is " + Library.list.size());
    }
}