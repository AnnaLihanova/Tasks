package com.example.tasks.forInterview;

import java.util.List;
import java.util.Objects;

public class Book {

    private final int id;
    private String nameBook;
    private String author;

    private List<Book> books;

    public Book(int id, String nameBook, String author) {
        this.id = id;
        this.nameBook = nameBook;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id && nameBook.equals(book.nameBook) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nameBook, author);
    }

    @Override
    public String toString() {
        return '\'' + nameBook + " " + '\'' +
               author;
    }
}
