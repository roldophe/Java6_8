package com.Radom.java.OnlineCourse.OPP.ConstructorBook;

import java.util.Arrays;

public class BookApplication {

	public static void main(String[] args) {
		int numberOfBook = 3;
		BookService bookService = new BookService();
		Book[] books = bookService.createBooks(numberOfBook);
		bookService.print(books);
		System.out.println("==================");
		System.out.println("After sorting....!");
		//bookService.sort(books);
		//Collections.sort(books);
		Arrays.sort(books);
		bookService.print(books);
		double totalAmount = bookService.totalAmount(books);
		System.out.println("Total Amount: "+totalAmount+"$$");
		
		

	}

}
