package com.example.tasks.forInterview;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookService {
    static void getShelvesOfBooks(List<Book> books) {

        List<Book> sortedBooks = books.stream()
                .sorted(Comparator.comparing(Book::getNameBook))
                .collect(Collectors.toList());
        System.out.println("Список книг " + sortedBooks);

        List<Book> shelves = new ArrayList<>();

        List<Book> shelf1 = new ArrayList<>();
        List<Book> shelf2 = new ArrayList<>();
        List<Book> shelf3 = new ArrayList<>();
        List<Book> shelf4 = new ArrayList<>();
        List<Book> shelf5 = new ArrayList<>();

        int shelfSize;
        int booksSize = books.size();

        System.out.println();
        System.out.println("Количество книг на полках");
        for (int i = 0; i < 5; i++) {
            if (booksSize % 5 != 0) {
                shelfSize = (books.size() / 5) + 1;
                booksSize--;
            } else {
                shelfSize = books.size() / 5;
            }
            System.out.println(shelfSize);
        }
           for (int i = 0; i < books.size(); i++) {
            if (i % 5 != 0) {
                shelf1.add(sortedBooks.get(i));
            }
            if (i % 5 == 1) {
                shelf2.add(sortedBooks.get(i));

            }
            if (i % 5 == 2) {
                shelf3.add(sortedBooks.get(i));

            }
            if (i % 5 == 3) {
                shelf4.add(sortedBooks.get(i));

            }
            if (i % 5 == 4) {
                shelf5.add(sortedBooks.get(i));
            }
        }
        System.out.println();
        System.out.println("Полка 1 " + shelf1);
        System.out.println("Полка 2 " + shelf2);
        System.out.println("Полка 3 " + shelf3);
        System.out.println("Полка 4 " + shelf4);
        System.out.println("Полка 5 " + shelf5);

        shelves.addAll(shelf1);
        shelves.addAll(shelf2);
        shelves.addAll(shelf3);
        shelves.addAll(shelf4);
        shelves.addAll(shelf5);

        System.out.println();
        System.out.println("Все книги " + shelves);
    }
}
