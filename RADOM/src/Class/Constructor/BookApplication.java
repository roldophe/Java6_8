package Class.Constructor;

import java.util.Arrays;
import java.util.Scanner;

public class BookApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfBook = 3;
        BookService bookService = new BookService();
        Book[] books = bookService.createBooks(numberOfBook);
        System.out.println("Before sorting: ");
        System.out.println("________________________");
        bookService.print(books);
        System.out.println("After sort:");
        //Collections.sort(books);
        Arrays.sort(books);
        //bookService.sort(books);
        bookService.print(books);
        System.out.println("------------------");
        double total=bookService.totalAmount(books);
        System.out.print("Total amount: "+"$$"+total);


    }
}
