package part_06_classes_encapsulation.classTasks.booksTask;

import java.util.ArrayList;
import java.util.List;

public class MyBooks {
    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();

        Book book = new Book("Harry Potter", 110.5, 715);

        books.add(book);
        books.add(new Book("Lord of the Rings", 70.75, 825));
        books.add(new Book("Lord of the Rings remastering", 95.75, 625));

        printBooksInformation(books);

    }

    public static void printBooksInformation(List<Book> booksToPrint){
        booksToPrint.forEach(book -> System.out.println(book));
    }
}
