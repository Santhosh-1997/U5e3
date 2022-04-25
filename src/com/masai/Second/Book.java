package com.masai.Second;

public abstract class Book {
    String bookName;
    String author;
    String publication;

    public Book(String bookName, String author, String publication) {
        this.bookName = bookName;
        this.author = author;
        this.publication = publication;
    }

    public Book() {

    }

    @Override
    public String toString() {
        return  bookName;

    }
}

class WingsOfFire extends Book{

    public WingsOfFire() {
        super();
    }

    public WingsOfFire(String bookName, String author, String publication) {
        super(bookName, author, publication);
    }
}

class Notebook extends Book{

    public Notebook(String bookName, String author, String publication) {
        super(bookName, author, publication);
    }
}
