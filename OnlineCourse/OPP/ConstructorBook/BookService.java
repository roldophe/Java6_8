package com.Radom.java.OnlineCourse.OPP.ConstructorBook;

public class BookService {

	public Book createBook() {
		String title = Utils.getString("Please intput title : ");
		String author = Utils.getString("Please intput author: ");
		double price = Utils.getDouble("Please intput price : ");
		Book book = new Book(title, author, price);
		return book;
	}

	public Book[] createBooks(int n) {
		Book[] books = new Book[n];
		for (int i = 0; i < n; i++) {
			books[i] = createBook();
		}
		return books;
	}

	public void print(Book[] books) {
		for (Book book : books) {
			System.out.println(book.toString());
		}
	}

	public void sort(Book[] books) {
		for (int i = 0; i < books.length; i++) {
			for (int j = i + 1; j < books.length; j++) {
				if (books[i].getPrice() > books[j].getPrice()) {
					Book temp = books[i];
					books[i] = books[j];
					books[j] = temp;
				}
			}
		}
	}

	public double totalAmount(Book[] books) {
		double total = 0;
		for (Book b : books) {
			total += b.getPrice();
		}
		return total;
	}

}
