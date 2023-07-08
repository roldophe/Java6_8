package com.Radom.java.OnlineCourse.Test;

public class Test {
	private String title;
	private String author;
	private double price;

	public Test(String addrTitle, String addrAuthor, Double addrPrice) {
		this.title = addrTitle;
		this.author = addrAuthor;
		this.price =  addrPrice;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public Double getPrice() {
		return price;
	}
	public String DisplayInfo()
	{
		return ("Title: %s Author: %s Price: %.2f $$".formatted(title, author, price));
	}
}
