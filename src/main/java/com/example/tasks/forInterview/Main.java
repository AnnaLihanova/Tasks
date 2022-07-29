package com.example.tasks.forInterview;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static BookService bookService;

    @Autowired
    public Main(BookService bookService) {
        this.bookService = bookService;
    }

    public static List<Book> books = new ArrayList<>();
    static Book book1 = new Book(1, "А Война и мир", "Толстой");
    static Book book2 = new Book(2, "Б Анна Каренина", "Толстой");
    static Book book3 = new Book(3, "В Детство", "Толстой");
    static Book book4 = new Book(4, "Г Вишневый сад", "Чехов");
    static Book book5 = new Book(5, "Д Чайка", "Чехов");
    static Book book6 = new Book(6, "Е Патата №6", "Чехов");
    static Book book7 = new Book(7, "Ж Что-то", "Кто-то");
    static Book book8 = new Book(8, "З Фо", "Кто-то");
    static Book book9 = new Book(9, "И Карп", "Кто-то");
    static Book book10 = new Book(10, "К Кофе", "Кто-то");
    static Book book11 = new Book(11, "Л Не знаю", "Кто-то");
    static Book book12 = new Book(12, "М Тула", "Кто-то");
    static Book book13 = new Book(12, "Н Тула", "Кто-то");

    public static void main(String[] args) {
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        books.add(book6);
        books.add(book7);
        books.add(book8);
        books.add(book9);
        books.add(book10);
        books.add(book11);
        books.add(book12);
        books.add(book13);

        bookService.getShelvesOfBooks(books);

    }
}
